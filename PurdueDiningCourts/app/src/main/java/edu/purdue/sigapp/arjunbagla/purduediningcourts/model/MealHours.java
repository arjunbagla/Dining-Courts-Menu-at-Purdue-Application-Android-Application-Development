package edu.purdue.sigapp.arjunbagla.purduediningcourts.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class MealHours {

    @SerializedName("StartTime") private String startTime;
    @SerializedName("EndTime") private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
