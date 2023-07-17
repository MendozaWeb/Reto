package com.reto_bbva.model;

import javax.persistence.Entity;

@Entity
public class Country {
    private String officialName;
    private String region;
    private String subregion;
    private String languages;
    private String currencies;
    private String coatOfArms;

    public Country(String officialName, String region, String subregion, String languages, String currencies, String coatOfArms) {
        this.officialName = officialName;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.currencies = currencies;
        this.coatOfArms = coatOfArms;
    }

    // Getters y setters

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String currencies) {
        this.currencies = currencies;
    }

    public String getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(String coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    @Override
    public String toString() {
        return "Country{" +
                "officialName='" + officialName + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", languages='" + languages + '\'' +
                ", currencies='" + currencies + '\'' +
                ", coatOfArms='" + coatOfArms + '\'' +
                '}';
    }
}
