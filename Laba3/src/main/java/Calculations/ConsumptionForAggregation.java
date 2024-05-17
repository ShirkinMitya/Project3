package Calculations;

public class ConsumptionForAggregation {

    String key;
    Float kiumValue;
    Integer year;

    public ConsumptionForAggregation(String key, Float kiumValue, Integer year) {
        this.key = key;
        this.kiumValue = kiumValue;
        this.year = year;
    }

    public void plus(Float value) {
        kiumValue += value;
    }

    public String getKey() {
        return key;
    }

    public Float getKiumValue() {
        return kiumValue;
    }

    public Integer getYear() {
        return year;
    }
}
