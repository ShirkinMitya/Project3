package Objects;

public class Country {

    private Integer country_id;
    private String country_name;
    private Integer region_id;

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer coutry_id) {
        this.country_id = coutry_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }
}
