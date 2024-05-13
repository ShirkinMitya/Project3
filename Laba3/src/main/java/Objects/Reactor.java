package Objects;

import java.util.Date;

public class Reactor {

    private Integer id;
    private String name;
    private String clas;
    private String model;
    private String status;
    private Float termal_capacity;
    private Date first_grid_connection;
    private Date date_shutdown;
    private Integer country_id;
    private Integer owner_id;
    private Integer operator_id;
    private Float burnup;
    private Float first_load;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getTermal_capacity() {
        return termal_capacity;
    }

    public void setTermal_capacity(Float termal_capacity) {
        this.termal_capacity = termal_capacity;
    }

    public Date getFirst_grid_connection() {
        return first_grid_connection;
    }

    public void setFirst_grid_connection(Date first_grid_connection) {
        this.first_grid_connection = first_grid_connection;
    }

    public Date getDate_shutdown() {
        return date_shutdown;
    }

    public void setDate_shutdown(Date date_shutdown) {
        this.date_shutdown = date_shutdown;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public Integer getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(Integer operator_id) {
        this.operator_id = operator_id;
    }

    public Float getBurnup() {
        return burnup;
    }

    public void setBurnup(Float burnup) {
        this.burnup = burnup;
    }

    public Float getFirst_load() {
        return first_load;
    }

    public void setFirst_load(Float first_load) {
        this.first_load = first_load;
    }

    @Override
    public String toString() {
        return "Reactor{" + "id=" + id + ", name=" + name + ", clas=" + clas + ", model=" + model + ", status=" + status + ", termal_capacity=" + termal_capacity + ", first_grid_connection=" + first_grid_connection + ", date_shutdown=" + date_shutdown + ", country_id=" + country_id + ", owner_id=" + owner_id + ", operator_id=" + operator_id + ", burnup=" + burnup + ", first_load=" + first_load + '}';
    }

}
