package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.DailyMenu;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class DiningMenuProvider {

    private static DiningMenusService menusService;

    static {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.hfs.purdue.edu")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        menusService = retrofit.create(DiningMenusService.class);
    }

    public static Call<DailyMenu> getMenus(String location, String date) {
        return menusService.getMenuForLocation(location, date);
    }
}
