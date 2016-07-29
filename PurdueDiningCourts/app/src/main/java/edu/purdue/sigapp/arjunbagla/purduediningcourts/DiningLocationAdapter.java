package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.DiningLocation;

/**
 * Created by arjunbagla on 10/1/15.
 */
public class DiningLocationAdapter extends BaseAdapter {

    private Context context;
    private List<DiningLocation> locations;

    public DiningLocationAdapter(Context context) {

        this.context = context;
        this.locations = DiningLocationProvider.getLocations();
    }

    @Override
    public int getCount() {
        return locations.size();
    }

    @Override
    public Object getItem(int position) {
        return locations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.dining_location_item, parent, false);
        }
        TextView label = (TextView) convertView.findViewById(R.id.dining_location_list_item);
        label.setText(locations.get(position).getDisplayName());
        return convertView;
    }
}
