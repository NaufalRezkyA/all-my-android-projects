package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama;
    EditText angka_kedua;
    TextView hasil;
    Button plus;
    Button minus;
    Button kali;
    Button bagi;
    Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama=findViewById(R.id.angka1);
        angka_kedua=findViewById(R.id.angka2);
        hasil =findViewById(R.id.texthasil);
        plus = findViewById(R.id.button);
        minus= findViewById(R.id.button6);
        kali= findViewById(R.id.button7);
        bagi= findViewById(R.id.button5);
        reset= findViewById(R.id.button8);
    }

    public void plus(View view) {
        double angka1= Double.parseDouble(angka_pertama.getText().toString());
        double angka2= Double.parseDouble(angka_kedua.getText().toString());

        double result = angka1+angka2;
        hasil.setText(Double.toString(result));
    }
    public void minus(View view) {
        double angka1= Double.parseDouble(angka_pertama.getText().toString());
        double angka2= Double.parseDouble(angka_kedua.getText().toString());

        double result = angka1-angka2;
        hasil.setText(Double.toString(result));
    }
    public void kali(View view) {
        double angka1= Double.parseDouble(angka_pertama.getText().toString());
        double angka2= Double.parseDouble(angka_kedua.getText().toString());

        double result = angka1*angka2;
        hasil.setText(Double.toString(result));
    }
    public void bagi(View view) {
        double angka1= Double.parseDouble(angka_pertama.getText().toString());
        double angka2= Double.parseDouble(angka_kedua.getText().toString());

        double result = angka1/angka2;
        hasil.setText(Double.toString(result));
    }
    public void reset(View view) {
        angka_pertama.setText("");
        angka_kedua.setText("");
        hasil.setText("0");
        angka_pertama.requestFocus();
    }
}
