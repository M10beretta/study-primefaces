package com.mber.ui;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class AutoCompleteTextArea {
    public List<String> sugessions(String str) {
        List<String> results = new ArrayList<>();
        if (str.equals("JavaTpoint")) {
            results.add("JavaTpoint is a Tutorial Site.");
            results.add("JavaTpoint is good to learn Java.");
            results.add("JavaTpoint provides technical tutorials.");
            results.add("JavaTpoint is easy to understand.");
            results.add("JavaTpoint is developed by Sonoo Jaiswal!");
        } else {
            results.add("JavaTpoint " + str);
        }
        return results;
    }
}
