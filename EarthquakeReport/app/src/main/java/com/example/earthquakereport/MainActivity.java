package com.example.earthquakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Earthquake> earthquakes = QueryUtils.exractEarthquake();
        ListView earthquakeListView = findViewById(R.id.list);
        final EartquakeAdapter adapter = new EartquakeAdapter(  this, earthquakes);earthquakeListView.setAdapter(adapter);
    }
}
