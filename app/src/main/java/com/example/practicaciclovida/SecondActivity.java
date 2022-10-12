package com.example.practicaciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView TwDatos;
    Button idnv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TwDatos = findViewById(R.id.idDatos);
        idnv2 = findViewById(R.id.idnv2);
        Intent inten = getIntent();
        String mensaje= inten.getStringExtra("Usuario ");
        String pasword = inten.getStringExtra("password ");


        TwDatos.setText(mensaje+""+pasword);
        Intent intent2 = new Intent(this,MainActivity.class);
         idnv2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(intent2);
             }
         });

    }
}