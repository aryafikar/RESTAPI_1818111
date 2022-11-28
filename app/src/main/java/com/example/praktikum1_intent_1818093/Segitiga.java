package com.example.praktikum1_intent_1818093;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText angka1 =
                (EditText)findViewById(R.id.alas);
        final EditText angka2 =
                (EditText)findViewById(R.id.tinggi);
        final TextView hasil =
                (TextView)findViewById(R.id.hasil_luas);
        final Button tampil =
                (Button)findViewById(R.id.btn_luas);
        tampil.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                double  x = Double.parseDouble(angka1.getText().toString());
                double  y = Double.parseDouble(angka2.getText().toString());

                double  z = 0.5 * x * y;

                hasil.setText(Double.toString(z));

            }
        });


    }

}