package Service;

import Objects.Company;
import Objects.Country;
import Objects.Kium;
import Objects.Reactor;
import Objects.Region;
import ReactorType.ReactorType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private List<Company> companyList = new ArrayList<>();
    private List<Region> regionList = new ArrayList<>();
    private List<Country> countryList = new ArrayList<>();
    private List<Reactor> reactorList = new ArrayList<>();
    private List<Kium> kiumList = new ArrayList<>();
    private Map<String, List<ReactorType>> reactorType = new HashMap<>();

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public List<Reactor> getReactorList() {
        return reactorList;
    }

    public void setReactorList(List<Reactor> reactorList) {
        this.reactorList = reactorList;
    }

    public List<Kium> getKiumList() {
        return kiumList;
    }

    public void setKiumList(List<Kium> kiumList) {
        this.kiumList = kiumList;
    }

    public Map<String, List<ReactorType>> getReactorType() {
        return reactorType;
    }

    public void setReactorType(Map<String, List<ReactorType>> reactorType) {
        this.reactorType = reactorType;
    }
    
}

    
