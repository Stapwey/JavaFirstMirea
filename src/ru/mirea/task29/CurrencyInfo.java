package ru.mirea.task29;

import java.io.Serializable;
import java.util.Arrays;

public class CurrencyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] countryInfo;
    private String[] capitalInfo;
    private String[] currencyInfo;

    public CurrencyInfo(String[] countryInfo, String[] capitalInfo, String[] currencyInfo){
        this.countryInfo = countryInfo;
        this.capitalInfo = capitalInfo;
        this.currencyInfo = currencyInfo;
    }

    public String[] getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(String[] countryInfo) {
        this.countryInfo = countryInfo;
    }

    public String[] getCapitalInfo() {
        return capitalInfo;
    }

    public void setCapitalInfo(String[] capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public String[] getCurrencyInfo() {
        return currencyInfo;
    }

    public void setCurrencyInfo(String[] currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "Страна: " + Arrays.toString(countryInfo) +
                ", Столица: " + Arrays.toString(capitalInfo) +
                ", Валюта: " + Arrays.toString(currencyInfo) +
                '}';
    }
}
