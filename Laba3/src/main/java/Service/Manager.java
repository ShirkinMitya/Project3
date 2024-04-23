package Service;

import Handler.Handler;
import Handler.JSONhandler;
import Handler.XMLhandler;
import Handler.YAMLhandler;
import Reactor.Reactor;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.tree.DefaultMutableTreeNode;

public class Manager {

    private Storage storage;
    private Handler firstHandler;

    public Manager() {
        this.storage = new Storage();
        this.firstHandler = new JSONhandler(storage);
        Handler secoHandler = new XMLhandler(storage);
        firstHandler.setNext(secoHandler);
        Handler thirdHandler = new YAMLhandler(storage);
        secoHandler.setNext(thirdHandler);

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

    public Handler getFirstHandler() {
        return firstHandler;
    }

}
