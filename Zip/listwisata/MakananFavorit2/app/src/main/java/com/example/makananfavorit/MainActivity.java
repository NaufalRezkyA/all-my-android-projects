package com.example.makananfavorit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFood;
    private ArrayList<Food> foods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food);

        foods = new ArrayList<>();

        foods.add(new Food("Cilok",5,2000,true));
        foods.add(new Food("Cimol",3.5f,4000,true));
        foods.add(new Food("Piscok",4,5000,true));
        foods.add(new Food("Colenak",2,10000,false));
        foods.add(new Food("Tape",1,5000,false));
        foods.add(new Food("Kue Putu",5,4000,true));

        LinearLayoutManager lm = new  LinearLayoutManager(this);
        FoodAdapter adapter = new FoodAdapter(this,foods);
        DividerItemDecoration divider = new DividerItemDecoration(this, lm.getOrientation());
        rvFood.setLayoutManager(lm);
        rvFood.setAdapter(adapter);
        rvFood.addItemDecoration(divider);

    }
}
