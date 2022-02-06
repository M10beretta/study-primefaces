package com.mber.ui;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class AutoComplete {
    private String countryName;

    public List<String> countryList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("India");
        list.add("Australia");
        list.add("Germany");
        list.add("Italy");
        list.add("United States");
        list.add("Russia");
        return list;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String CountryName) {
        this.countryName = CountryName;
    }
}