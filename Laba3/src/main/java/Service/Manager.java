package Service;

import Handler.Handler;
import Handler.JSONhandler;
import Handler.XMLhandler;
import Handler.YAMLhandler;
import Reactor.Reactor;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.tree.DefaultMutableTreeNode;

public class Manager {

    private Storage storage;
    private Handler firstHandler;

    public Manager() {
        this.storage = new Storage();
        this.firstHandler = new JSONhandler();
        Handler secoHandler = new XMLhandler();
        firstHandler.setNext(secoHandler);
        Handler thirdHandler = new YAMLhandler();
        secoHandler.setNext(thirdHandler);

    }

    public void read(File file) throws IOException, MyException {   
        storage.getReactors().put(file.getName(), this.firstHandler.handleRequest(file));
    }

    public DefaultMutableTreeNode addInfotoGUI() {
        DefaultMutableTreeNode mainNode = new DefaultMutableTreeNode("реакторы");
        for (Entry<String, List<Reactor>> entry : storage.getReactors().entrySet()) {
            DefaultMutableTreeNode fileNode = new DefaultMutableTreeNode(entry.getKey());
            for (Reactor reactor : entry.getValue()) {
                fileNode.add(reactor.reactoreNode());
            }
            mainNode.add(fileNode);
        }
        return mainNode;
    }

}
