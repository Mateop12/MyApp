package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btn_registrar;
    Button btn_iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_registrar = findViewById(R.id.btn_registrar);
        btn_iniciar = findViewById(R.id.btn_iniciar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irRegistro();
            }
        });

        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ir_InicioSesion();
            }
        });

    }

    public void irRegistro(){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }

    public void ir_InicioSesion(){
        Intent intent2 = new Intent(this, InicioSesion.class);
        startActivity(intent2);
    }
}