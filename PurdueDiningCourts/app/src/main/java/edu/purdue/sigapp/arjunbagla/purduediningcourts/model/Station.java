package edu.purdue.sigapp.arjunbagla.purduediningcourts.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class Station {

    @SerializedName("Name") private String name;
    @SerializedName("Items") private List<DiningItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DiningItem> getItems() {
        return items;
    }

    public void setItems(List<DiningItem> items) {
        this.items = items;
    }
}
