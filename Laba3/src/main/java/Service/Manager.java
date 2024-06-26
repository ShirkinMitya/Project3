package Service;

import Calculations.Aggregation;
import Calculations.ConsumptionOneReactor;
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
import java.sql.SQLException;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.table.DefaultTableModel;
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

    public boolean isReadyForCalculations() {
        return !storage.getReactorTypeMap().isEmpty() && !storage.getReactorList().isEmpty();
    }

    public void createDB() throws SQLException {
        dbService.dropDB();
        dbService.createBD();
        readXLSX();
        dbService.writeDB();
    }

    public void uploadDB() throws SQLException {
        dbService.selectDB();
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
            System.out.println("Oшибка при чтениии EXCEL" + e.getMessage());
        }
    }

    public void readFile(File file) throws IOException, MyException {
        storage.getReactorTypeMap().put(file.getName(), this.firstHandler.handleRequest(file));
    }

    public void calculateConsumptionForReactor() {
        new ReactrorUnification().unification(storage);
        new ConsumptionOneReactor().calculateConsumption(storage.getReactorList(), storage.getKiumList());
    }

    public DefaultTableModel addTableCountriesToGui() {
        return new Aggregation().countiesAggregation(storage);
    }

    public DefaultTableModel addTableRegionsToGui() {
        return new Aggregation().regionsAggregation(storage);
    }

    public DefaultTableModel addTableOperatorsToGui() {
        return new Aggregation().operatorAggregation(storage);
    }

    public DefaultMutableTreeNode addTreeToGUI() {
        DefaultMutableTreeNode mainNode = new DefaultMutableTreeNode("реакторы");
        for (Entry<String, List<ReactorType>> entry : storage.getReactorTypeMap().entrySet()) {
            DefaultMutableTreeNode fileNode = new DefaultMutableTreeNode(entry.getKey());
            for (ReactorType reactor : entry.getValue()) {
                fileNode.add(reactor.reactoreNode());
            }
            mainNode.add(fileNode);
        }
        return mainNode;
    }
}
