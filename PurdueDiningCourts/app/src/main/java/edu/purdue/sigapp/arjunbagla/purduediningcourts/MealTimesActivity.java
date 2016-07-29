package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.StringTokenizer;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class MealTimesActivity extends Activity implements AdapterView.OnItemClickListener {

    private static String[] TIMES = {
            "Breakfast",
            "Lunch",
            "Dinner"
    };
    private ListView timesList;
    private String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal_times_list);
        location = getIntent().getStringExtra("LOCATION");
        timesList = (ListView) findViewById(R.id.meal_times);
        timesList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,TIMES));
        timesList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(this, DiningMenuActivity.class);
        i.putExtra("LOCATION", location);
        i.putExtra("TIME", TIMES[position]);
        startActivity(i);
    }
}
