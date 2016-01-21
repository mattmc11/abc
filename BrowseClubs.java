package com.example.matthew.footballgrounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BrowseClubs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsenal);
        Button bArsenal = (Button) findViewById(R.id.bArsenal);
        bArsenal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowseClubs.this, Arsenal.class);
                startActivity(intent);
            }
        });

        Button bChelsea = (Button) findViewById(R.id.bChelsea);
        bChelsea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowseClubs.this, Chelsea.class);
                startActivity(intent);
            }
        });

        Button bLiverpool = (Button) findViewById(R.id.bLiverpool);
        bLiverpool.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowseClubs.this, Liverpool.class);
                startActivity(intent);
            }
        });
        Button bManc = (Button) findViewById(R.id.bManc);
        bManc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowseClubs.this, ManC.class);
                startActivity(intent);
            }
        });
        Button bManu = (Button) findViewById(R.id.bManu);
        bManu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowseClubs.this, ManU.class);
                startActivity(intent);
            }
        });
    }

}
