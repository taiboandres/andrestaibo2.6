package com.example.empanadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button boton,botonM;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conexion conn = new conexion(this, "db",null,1);

        spinner= (Spinner) findViewById(R.id.spinner);
        ArrayList<String> list = new ArrayList<>();
        list.add("empanada 1");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_dropdown_item,list);
        spinner.setAdapter(adapter);

        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nuevo();
            }
        });

        boton = (Button) findViewById(R.id.botonM);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapa();
            }
        });

    }
    public void nuevo(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void mapa(){
        Intent intent = new Intent(this, Mapa.class);
        startActivity(intent);
    }
}
