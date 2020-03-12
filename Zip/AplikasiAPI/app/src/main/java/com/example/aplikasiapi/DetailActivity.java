package com.example.aplikasiapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView tvName, tvNationality, tvPlace, tvBirthdate, tvBirthplace, tvDescription ;
    private String idPlayer;
    private Gson gson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        imageView = findViewById(R.id.imagepath);
        tvName = findViewById(R.id.tv_name);
        tvNationality = findViewById(R.id.tv_nationality);
        tvPlace = findViewById(R.id.tv_place);
        tvBirthdate = findViewById(R.id.tv_birthdate);
        tvBirthplace = findViewById(R.id.tv_birthplace);
        tvDescription = findViewById(R.id.tv_description);
        gson = new Gson();

        idPlayer = getIntent().getStringExtra("idPlayer");
        String url = "https://www.thesportsdb.com/api/v1/json/1/lookupplayer.php?id="+idPlayer;

        //ambil data dg Volley + JSON
        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //ambil nilai dan set ke komponen
                        PlayerResult result = gson.fromJson(response,PlayerResult.class);
                        Player player = result.getPlayer().get(0);
                        tvName.setText(player.getName());
                        tvNationality.setText(player.getNationality());
                        tvPlace.setText(player.getBirthPlace());
                        tvBirthdate.setText(player.getBirthDate());
                        tvBirthplace.setText(player.getBirthPlace());
                        tvDescription.setText(player.getDescription());
                        Picasso.get().load(player.getImagePath()).into(imageView);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        queue.add(stringRequest);
    }
}
