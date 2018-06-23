package com.example.android.arrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Fall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall);
        LinearLayout FallViewVariable = (LinearLayout) findViewById(R.id.FallView);
        //create an Array of Smells
        ArrayList<String> fallSmells = new ArrayList<String>();
        fallSmells.add("Fallidonia");
        fallSmells.add("Fallippi");
        fallSmells.add("Fallichiban");
        fallSmells.add("Fallicula");
        fallSmells.add("Fallidocane");

        int index = 0;

        while (index < 5) {
            TextView wordView = new TextView(this);
            wordView.setText(fallSmells.get(index));
            //use the add.View method to add the childview wordView to the parent view FallViewVariable
            FallViewVariable.addView(wordView);
            index = index + 1;
        }
    }
}