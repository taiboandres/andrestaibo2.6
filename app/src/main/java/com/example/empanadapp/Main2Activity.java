package com.example.empanadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
public class Main2Activity extends AppCompatActivity {
    private Button nuevoing;
    LinearLayout layoutv;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nuevoing = (Button) findViewById(R.id.nuevoing);
        nuevoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ing();
            }
        });
    }
    public void ing()
    {
        dialog dialog=new dialog();
        dialog.show(getSupportFragmentManager(),"dialog");

    }
}
