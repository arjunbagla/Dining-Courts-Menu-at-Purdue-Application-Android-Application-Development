package edu.purdue.sigapp.arjunbagla.purduediningcourts.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class DailyMenu {

    @SerializedName("Location") private String location;
    @SerializedName("Date") private String date;
    @SerializedName("Notes") private String notes;
    @SerializedName("Meals") private List<Meal> meals;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}
