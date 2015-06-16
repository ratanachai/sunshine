package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] data = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/36",
                "Weds - Foggy - 73/47",
                "Thurs - Foggy - 74/55",
                "Fri - Foggy - 72/32",
                "Sat - Foggy - 71/48",
                "Sun - Foggy - 70/67",
                "Tomorrow - Foggy - 70/36",
                "Weds - Foggy - 73/47",
                "Thurs - Foggy - 74/55",
                "Tomorrow - Foggy - 70/36",
                "Weds - Foggy - 73/47",
                "Thurs - Foggy - 74/55",
                };

        ArrayAdapter<String> forecastAdapter =new ArrayAdapter<String>(
                getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, data);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

        return rootView;
    }
}
