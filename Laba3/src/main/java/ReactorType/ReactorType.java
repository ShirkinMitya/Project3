package ReactorType;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class ReactorType {

    private String type;
    private Float burnup;
    private Float kpd;
    private Float enrichment;
    private Float termal_capacity;
    private Float electrical_capacity;
    private Float life_time;
    private Float first_load;
    private String source;

    public MutableTreeNode reactoreNode() {
        DefaultMutableTreeNode generalnode = new DefaultMutableTreeNode(type);
        generalnode.add(new DefaultMutableTreeNode("burnup: " + burnup));
        generalnode.add(new DefaultMutableTreeNode("kpd: " + kpd));
        generalnode.add(new DefaultMutableTreeNode("enrichment" + enrichment));
        generalnode.add(new DefaultMutableTreeNode("terminal capacity: " + termal_capacity));
        generalnode.add(new DefaultMutableTreeNode("electric capacity: " + electrical_capacity));
        generalnode.add(new DefaultMutableTreeNode("life time: " + life_time));
        generalnode.add(new DefaultMutableTreeNode("first load: " + first_load));
        generalnode.add(new DefaultMutableTreeNode("source: " + source));
        return generalnode;
    }

    public String getType() {
        return type;
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

    public String getSource() {
        return source;
    }

    public void setType(String type) {
        this.type = type;
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

    public void setSource(String source) {
        this.source = source;
    }

}
