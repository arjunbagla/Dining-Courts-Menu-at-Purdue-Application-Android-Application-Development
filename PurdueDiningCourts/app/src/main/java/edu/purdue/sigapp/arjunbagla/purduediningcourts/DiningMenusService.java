package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.DailyMenu;
import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.DiningLocation;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by arjunbagla on 10/13/15.
 */
public interface DiningMenusService {

    @GET("/menus/v2/locations/{location}/{date}")
    Call<DailyMenu> getMenuForLocation(
            @Path("location") String location,
            @Path("date") String date
    );

}
