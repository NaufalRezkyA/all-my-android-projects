package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnStore;
    private Button btnGetAll;
    private EditText etname;
    private DatabaseHelper databaseHelper;
    private TextView tvnames;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStore = findViewById(R.id.btnStore);
        btnGetAll = findViewById(R.id.btnnget);
        etname = findViewById(R.id.etname);
        tvnames = findViewById(R.id.tvnames);
        databaseHelper = new DatabaseHelper(this);

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tambahkan data
                long jum = databaseHelper.addStudenDetail(etname.getText().toString());
                Log.d("jumlah",jum+" jumlah");
                etname.setText("");
                Toast.makeText(MainActivity.this,"Stored Succesfully!",Toast.LENGTH_SHORT).show();
            }
        });
        btnGetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tampilkan data
                arrayList = databaseHelper.getAllStudentList();
                tvnames.setText("");
                for(String x:arrayList){
                    tvnames.setText(tvnames.getText().toString()+", "+x);
                }

            }
        });
    }
}
