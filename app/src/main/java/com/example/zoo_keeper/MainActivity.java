package com.example.zoo_keeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Gorilla gorilla = new Gorilla();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit);
        gorilla.throwSth(true);
        gorilla.throwSth(true);
        gorilla.throwSth(true);
        gorilla.eatBananas(true);
        gorilla.eatBananas(true);
        gorilla.climb(true);
        editText.setText(String.valueOf(gorilla.getEnergyLevel()));
        Log.e("----",String.valueOf(gorilla.getEnergyLevel()));
    }
}