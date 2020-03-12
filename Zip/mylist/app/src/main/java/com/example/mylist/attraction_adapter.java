package com.example.mylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class attraction_adapter extends BaseAdapter {
    private Context context;
    private ArrayList <attraction> place;

    public void setAttraction(ArrayList<attraction> place) {
        this.place = place;
    }

    public attraction_adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return place.size();
    }

    @Override
    public Object getItem(int i) {
        return place.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            boolean attachToRoot;
            view = LayoutInflater.from(context).inflate(R.layout.item_place,viewGroup,false);
        }
        Viewholder viewholder = new Viewholder(view);
        attraction place = (attraction) getItem(i);
        viewholder.bind(place);
                return view;
    }

    private class Viewholder{
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;
        public Viewholder (View view){
            txtName = view.findViewById(R.id.txt_name);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);


        }

        void bind (attraction places){
            txtName.setText(places.getPlacename());
            txtDescription.setText(places.getDescription());
            imgPhoto.setImageResource(places.getImage());

        }
    }



}
