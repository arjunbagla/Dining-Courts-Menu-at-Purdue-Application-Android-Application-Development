package edu.purdue.sigapp.arjunbagla.purduediningcourts.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class Allergen {

    @SerializedName("Name") private String name;
    @SerializedName("Value") private boolean value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
