package com.example.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private attraction_adapter adapter;
    private ArrayList<attraction> places;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new attraction_adapter(this);
        listView = findViewById(R.id.lv_list);
        prepare();
        addItem();
    }
    private void addItem(){
        places = new ArrayList<>();

        for (int i=0; i < dataName.length; i++){
            attraction place = new attraction();
            place.setImage(dataPhoto.getResourceId(i, -1 ));
            place.setPlacename(dataName[i]);
            place.setDescription(dataDescription[i]);
            places.add(place);
        }
        adapter.setAttraction(places);
        listView.setAdapter(adapter);
    }
    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.description);
        dataPhoto = getResources().obtainTypedArray(R.array.image);


    }
}
