package edu.purdue.sigapp.arjunbagla.purduediningcourts.model;

/**
 * Created by arjunbagla on 10/1/15.
 */

//The class encapsulates all the data we need to represent a single DiningLocation.
    //Defines the structure of the dining location

public class DiningLocation {

    private String displayName;
    private String urlPathName;
    private double latitude, longitude;

    public DiningLocation() {
    }

    public DiningLocation(String displayName, String urlPathName, double latitude, double longitude) {
        this.displayName = displayName;
        this.urlPathName = urlPathName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getUrlPathName() {
        return urlPathName;
    }

    public void setUrlPathName(String urlPathName) {
        this.urlPathName = urlPathName;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

//    private String name;
//    private double latitude, longitude;
//
//    public DiningLocation(String name, double latitude, double longitude) {
//        this.name = name;
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }
//
//    public DiningLocation() {
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
