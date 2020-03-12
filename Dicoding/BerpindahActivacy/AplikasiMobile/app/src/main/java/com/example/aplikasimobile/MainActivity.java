package com.example.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Deklarasikan Variabel
    EditText Textnama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Panggil Variabel Berdasarkan id
        Textnama = (EditText)findViewById(R.id.TxtNama);
        Hasil = (TextView)findViewById(R.id.Lbl_Nama);
    }

    // Buat Method TampilNama Sesuai Dengan property Onclick pada Button
    public void TampilNama(View v){
        Hasil.setText("Nama Anda: "+Textnama.getText());
    }
}
