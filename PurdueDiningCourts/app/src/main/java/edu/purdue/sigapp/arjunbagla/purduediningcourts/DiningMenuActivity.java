package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.DailyMenu;
import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.Meal;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class DiningMenuActivity extends Activity {
    private String location, time;
    private ListView menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dining_menu);
        location = getIntent().getStringExtra("LOCATION");
        time = getIntent().getStringExtra("TIME");
        menuList = (ListView) findViewById(R.id.dining_menu);

        Date today = new Date();
        String formatted = new SimpleDateFormat("yyyy-MM-dd").format(today);
        Call<DailyMenu> result = DiningMenuProvider.getMenus(location, formatted);
        result.enqueue(new Callback<DailyMenu>() {
            @Override
            public void onResponse(Response<DailyMenu> response, Retrofit retrofit) {
                //Log.d("thingy", response.message());
                DailyMenu menus = response.body();
                for(Meal m : menus.getMeals()) {
                    if (m.getName().equals(time)) {
                        menuList.setAdapter(new DiningMenuAdapter(DiningMenuActivity.this, m.getStations()));
                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("thingy", t.getMessage());
            }
        });

    }
}
