package com.example.android.arrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Summer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer);


        //create an Array of Smells
        ArrayList<String> SummerSmells = new ArrayList<String>();
        SummerSmells.add("Summeridonia");
        SummerSmells.add("Summerippi");
        SummerSmells.add("Summerichiban");
        SummerSmells.add("Summericula");
        SummerSmells.add("Summeridocane");



        //find the linearLayout called SummerView and store it in a variable called SummerViewVariable

        LinearLayout SummerViewVariable = (LinearLayout)findViewById(R.id.SummerView);

        //create and add TextViews to the linearLayout we just created
        //start by creating the textView Object using a constructor
        // it takes in one input, context


        //to change the text that is on the screen, use .setText method
        //using the .get method to get the first word in the SummerSmells Array list


        int index=0;

        while (index<5) {
            TextView wordView = new TextView(this);
            wordView.setText(SummerSmells.get(index));
            //use the add.View method to add the childview wordView to the parent view SummerViewVariable
            SummerViewVariable.addView(wordView);
            index=index+1;
        }

    }

}