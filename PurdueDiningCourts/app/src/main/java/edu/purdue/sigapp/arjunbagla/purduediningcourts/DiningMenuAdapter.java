package edu.purdue.sigapp.arjunbagla.purduediningcourts;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.DiningItem;
import edu.purdue.sigapp.arjunbagla.purduediningcourts.model.Station;

/**
 * Created by arjunbagla on 10/13/15.
 */
public class DiningMenuAdapter extends BaseAdapter {

    private Context context;
    private List<DiningItem> menus = new ArrayList<DiningItem>();

    public DiningMenuAdapter(Context context, List<Station> stations) {
        this.context = context;
        for(Station s: stations) {
            menus.addAll(s.getItems());
        }
    }

    @Override
    public int getCount() {
        return menus.size();
    }

    @Override
    public Object getItem(int position) {
        return menus.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.dining_item, parent, false);
        }
        TextView label = (TextView) convertView.findViewById(R.id.dining_item);
        label.setText(menus.get(position).getName()+"");
        return convertView;
    }
}
