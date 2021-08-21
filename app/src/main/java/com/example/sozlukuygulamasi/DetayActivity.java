package com.example.sozlukuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    private TextView textViewIngilizceDetay, textViewTurkceDetay;
    private Kelimeler kelime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        textViewIngilizceDetay = findViewById(R.id.textViewIngilizceDetay);
        textViewTurkceDetay = findViewById(R.id.textViewTurkceDetay);

        kelime = (Kelimeler) getIntent().getSerializableExtra("kelimeler");

        textViewIngilizceDetay.setText(kelime.getIngilizce());
        textViewTurkceDetay.setText(kelime.getTurkce());

    }
}