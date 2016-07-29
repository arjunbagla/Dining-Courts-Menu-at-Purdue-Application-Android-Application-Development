package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import java.util.ArrayList;
import java.util.List;

import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.DiningLocation;

/**
 * Created by arjunbagla on 10/1/15.
 */

// Make the class abstarct so that no one else can refer to it.

public abstract class DiningLocationProvider {

    private static List<DiningLocation> locations = new ArrayList<DiningLocation>() {{
        add(new DiningLocation("Earhart Dining Court", "earhart", 40.425615, -86.925124));
        add(new DiningLocation("Ford Dining Court", "ford", 40.431898, -86.919561));
        add(new DiningLocation("Hillenbrand Dining Court", "hillenbrand",  40.426499, -86.926663));
        add(new DiningLocation("Wiley Dining Court", "wiley", 40.428578, -86.921133));
        add(new DiningLocation("Windsor Dining Court", "windsor",  40.427140, -86.920982));

    }};

    public static List<DiningLocation> getLocations() {
        return locations;

    }

}
