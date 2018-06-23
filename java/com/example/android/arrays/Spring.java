package com.example.android.arrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Spring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);
        //create an Array of Smells
        ArrayList<String> SpringSmells = new ArrayList<String>();

        LinearLayout SpringViewVariable = (LinearLayout)findViewById(R.id.SpringView);
        
        SpringSmells.add("Springidonia");
        SpringSmells.add("Springippi");
        SpringSmells.add("Springichiban");
        SpringSmells.add("Springicula");
        SpringSmells. add("Springidocane");



        int index=0;

        while (index<5) {
            TextView wordView = new TextView(this);
            wordView.setText(SpringSmells.get(index));
            //use the add.View method to add the childview wordView to the parent view SpringViewVariable
            SpringViewVariable.addView(wordView);
            index=index+1;
        }
}}
