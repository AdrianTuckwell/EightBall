package com.codeclan.example.eightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by user on 08/11/2016.
 */

public class EightBall extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("EightBall", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
