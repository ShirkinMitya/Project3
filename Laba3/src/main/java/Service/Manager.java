package Service;

import Calculations.ReactrorUnification;
import DataBase.DBService;
import FileReader.ReaderXLSX;
import Handler.Handler;
import Handler.JSONhandler;
import Handler.XMLhandler;
import Handler.YAMLhandler;
import ReactorType.ReactorType;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.tree.DefaultMutableTreeNode;

public class Manager {

    private Storage storage;
    private Handler firstHandler;
    DBService dbService;

    public Manager() {
        this.storage = new Storage();
        this.dbService = new DBService(storage);
        this.firstHandler = new JSONhandler();
        Handler secoHandler = new XMLhandler();
        firstHandler.setNext(secoHandler);
        Handler thirdHandler = new YAMLhandler();
        secoHandler.setNext(thirdHandler);
    }

    public void createDB() {
        dbService.dropDB();
        System.out.println("OK");
        dbService.createBD();
        System.out.println("OK");
        readXLSX();
        dbService.writeDB();
        System.out.println("OK");
    }

    public void uploadDB() {
        dbService.selectDB();
        System.out.println("OK");
        new ReactrorUnification().unification(storage);
        storage.getReactorList().forEach(rector -> System.out.println(rector));
    }

    public void readXLSX() {
        ReaderXLSX readerxlsx = new ReaderXLSX();
        try {
            storage.setCompanyList(readerxlsx.readCompany());
            storage.setCountryList(readerxlsx.readCountry());
            storage.setReactorList(readerxlsx.readReactor());
            storage.setKiumList(readerxlsx.readKium());
            storage.setRegionList(readerxlsx.readRegion());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(File file) throws IOException, MyException {
        storage.getReactorType().put(file.getName(), this.firstHandler.handleRequest(file));
        new ReactrorUnification().unification(storage);
    }

    public DefaultMutableTreeNode addInfotoGUI() {
        DefaultMutableTreeNode mainNode = new DefaultMutableTreeNode("реакторы");
        for (Entry<String, List<ReactorType>> entry : storage.getReactorType().entrySet()) {
            DefaultMutableTreeNode fileNode = new DefaultMutableTreeNode(entry.getKey());
            for (ReactorType reactor : entry.getValue()) {
                fileNode.add(reactor.reactoreNode());
            }
            mainNode.add(fileNode);
        }
        return mainNode;
    }
}
