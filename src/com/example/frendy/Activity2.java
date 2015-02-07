package com.example.frendy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class Activity2 extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private Button coffeeButton;
    private String activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        coffeeButton = (Button)findViewById(R.id.option_1);
        coffeeButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        //respond to click
        if(v.getId()==coffeeButton.getId()){
            //the button was clicked
            activity = "coffee";
            Intent myIntent = new Intent(this, Activity2.class);

        }
    }



}
