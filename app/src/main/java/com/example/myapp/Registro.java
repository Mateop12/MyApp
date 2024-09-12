package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button btn_volverhome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btn_volverhome = findViewById(R.id.btn_volverhome);

        btn_volverhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volverHome();
            }
        });
    }

    public void volverHome(){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }
}