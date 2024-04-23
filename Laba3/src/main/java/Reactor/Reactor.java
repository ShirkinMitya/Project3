package Reactor;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class Reactor {

    private String name;
    private Float burnup;
    private Float kpd;
    private Float enrichment;
    private Float termal_capacity;
    private Float electrical_capacity;
    private Float life_time;
    private Float first_load;
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBurnup(Float burnup) {
        this.burnup = burnup;
    }

    public void setKpd(Float kpd) {
        this.kpd = kpd;
    }

    public void setEnrichment(Float enrichment) {
        this.enrichment = enrichment;
    }

    public void setTermal_capacity(Float termal_capacity) {
        this.termal_capacity = termal_capacity;
    }

    public void setElectrical_capacity(Float electrical_capacity) {
        this.electrical_capacity = electrical_capacity;
    }

    public void setLife_time(Float life_time) {
        this.life_time = life_time;
    }

    public void setFirst_load(Float first_load) {
        this.first_load = first_load;
    }

    public String getName() {
        return name;
    }

    public Float getBurnup() {
        return burnup;
    }

    public Float getKpd() {
        return kpd;
    }

    public Float getEnrichment() {
        return enrichment;
    }

    public Float getTermal_capacity() {
        return termal_capacity;
    }

    public Float getElectrical_capacity() {
        return electrical_capacity;
    }

    public Float getLife_time() {
        return life_time;
    }

    public Float getFirst_load() {
        return first_load;
    }

    public MutableTreeNode reactoreNode() {
        DefaultMutableTreeNode generalnode = new DefaultMutableTreeNode(name);
        generalnode.add(new DefaultMutableTreeNode(burnup));
        generalnode.add(new DefaultMutableTreeNode(kpd));
        generalnode.add(new DefaultMutableTreeNode(enrichment));
        generalnode.add(new DefaultMutableTreeNode(termal_capacity));
        generalnode.add(new DefaultMutableTreeNode(electrical_capacity));
        generalnode.add(new DefaultMutableTreeNode(life_time));
        generalnode.add(new DefaultMutableTreeNode(first_load));
        generalnode.add(new DefaultMutableTreeNode(source));
        return generalnode;

    }

}
