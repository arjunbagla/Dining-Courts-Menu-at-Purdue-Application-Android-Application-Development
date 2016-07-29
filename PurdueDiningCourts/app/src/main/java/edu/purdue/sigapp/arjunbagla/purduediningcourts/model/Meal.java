package edu.purdue.sigapp.arjunbagla.purduediningcourts.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class Meal {

    @SerializedName("Name") private String name;
    @SerializedName("Order") private int order;
    @SerializedName("Hours") private MealHours hours;
    @SerializedName("Stations") private List <Station> stations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public MealHours getHours() {
        return hours;
    }

    public void setHours(MealHours hours) {
        this.hours = hours;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
