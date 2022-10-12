package com.example.practicaciclovida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout fondo;

    Button idnv;
    Button idnv2;
    EditText EtUs;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* fondo = findViewById(R.id.idFondo);*/
        idnv= findViewById(R.id.idnv);
        idnv2= findViewById(R.id.idnv2);
        EtUs= findViewById(R.id.idEtUs);
        pass= findViewById(R.id.idpass);
        Intent intent = new Intent(this,SecondActivity.class);
        idnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        Intent intent2 = new Intent(this,SecondActivity.class);
        idnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = EtUs.getText().toString();
                String password = pass.getText().toString();

                intent.putExtra("usurario",usuario);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });



       /* fondo.setOnClickListener(new View.OnClickListener() {
            Colores db = new Colores();
            @Override
            public void onClick(View view) {

                fondo.setBackgroundColor(db.genColor());
            }
        });*/
        Toast.makeText(this, "Estoy en on create", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart () {
        super.onStart();
        Toast.makeText(this, "Estoy en onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume () {
        super.onResume();
        Toast.makeText(this, "Estoy en onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Estoy en onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Estoy en onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        /*fondo = findViewById(R.id.idFondo);*/

       /* fondo.setOnClickListener(new View.OnClickListener() {
            Colores db = new Colores();
            @Override
            public void onClick(View view) {
                //Función para el metodo de cambio de color atra vez de la clase
                fondo.setBackgroundColor(db.genColores2());
            }
        });
        Toast.makeText(this, "Estoy en onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Estoy en onDestroy", Toast.LENGTH_LONG).show();
    }*/

}
}