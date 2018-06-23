package com.example.android.arrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Winter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter);
        String season ="Winter";
        LinearLayout ViewVariable = (LinearLayout) findViewById(R.id.winterView);
        //create an Array of Smells
        ArrayList<String> Smells = new ArrayList<String>();
        Smells.add(season + "idonia");
        Smells.add(season + "rippi");
        Smells.add(season + "richiban");
        Smells.add(season + "ricula");
        Smells.add(season + "orama");
        Smells.add(season + "alula");
        Smells.add(season + "greeno");
        Smells.add(season + "ratpack");

        int index = 0;


        while (index < Smells.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(Smells.get(index));
            //use the add.View method to add the childview wordView to the parent view ViewVariable
            ViewVariable.addView(wordView);
            index = index + 1;
        }
    }}