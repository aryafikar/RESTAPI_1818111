package com.example.praktikum1_intent_1818112;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void biodata(View view){
        Intent a = new Intent(MainActivity.this, Biodata.class);
        startActivity(a);
    }

    public void Segitiga(View view){
        Intent b = new Intent(MainActivity.this, Segitiga.class);
        startActivity(b);
    }

}