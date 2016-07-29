package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by arjunbagla on 10/1/15.
 */

// Defines the logic of our location list
    // This fragment will handle creating UI for every "Dining Location" we support on campus.

public class DiningLocationFragment extends Fragment implements AdapterView.OnItemClickListener { // Extends android.app.Fragment

    private ListView diningLocationList;

    @Nullable
    @Override
    //onCreateView is really similar to onCreate on our Activity.
    // The main difference is that onCreate itself has to inflate the view with setContentView
    // With fragments, we just return the View and Android takes care of the rest.
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.dining_location_list, container, false);
        diningLocationList = (ListView)layout .findViewById(R.id.dining_location_listview);
        diningLocationList.setAdapter(new DiningLocationAdapter(getActivity())); // getActivity() method will return the Activity which the Vragment sits in
        diningLocationList.setOnItemClickListener(this);
        return layout;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String clickedLocation = DiningLocationProvider.getLocations().get(position).getUrlPathName();
        Intent i = new Intent(getActivity(), MealTimesActivity.class);
        i.putExtra("LOCATION", clickedLocation);
        startActivity(i);
    }
}
