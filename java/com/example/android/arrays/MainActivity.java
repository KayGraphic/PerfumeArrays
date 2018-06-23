package com.example.android.arrays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {


    String[] PerfumeArray = {"Anhedonia","Boohedonia","Sadhedonia","Calidonia","Jamhedonia" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        public void Spring(View view){
            Intent openSpring = new Intent(this, Spring.class);
            startActivity(openSpring);
            }
    public void Summer(View view){
        Intent openSummer = new Intent(this, Summer.class);
        startActivity(openSummer);
    }
    public void Winter(View view){
        Intent openWinter = new Intent(this, Winter.class);
        startActivity(openWinter);
    }
    public void Fall(View view){
        Intent openFall = new Intent(this, Fall.class);
        startActivity(openFall);
    }
}