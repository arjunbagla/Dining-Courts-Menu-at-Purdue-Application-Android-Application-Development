package edu.purdue.sigapp.arjunbagla.purduediningcourts.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Created by arjunbagla on 10/13/15.
 */
public class DiningItem {

    @SerializedName("ID") private String id;
    @SerializedName("Name") private String name;
    @SerializedName("IsVegetarian") private boolean isVegetarian ;
    @SerializedName("Allergens") private List<Allergen> allergens;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public List<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<Allergen> allergens) {
        this.allergens = allergens;
    }
}

