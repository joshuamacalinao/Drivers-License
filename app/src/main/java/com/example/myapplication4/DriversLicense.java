package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class DriversLicense extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_license);

        Intent i = getIntent();
        String output1 = i.getStringExtra("input1");
        String output2 = i.getStringExtra("input2");
        String output3 = i.getStringExtra("input3");
        String output4 = i.getStringExtra("input4");
        String output5 = i.getStringExtra("input5");
        String output6 = i.getStringExtra("input6");
        String output7 = i.getStringExtra("input7");
        String output8 = i.getStringExtra("input8");
        ((TextView)findViewById(R.id.outputFullName)).setText(output1);
        ((TextView)findViewById(R.id.outputNationality)).setText(output2);
        ((TextView)findViewById(R.id.outputSex)).setText(output3);
        ((TextView)findViewById(R.id.outputBirthDate)).setText(output4);
        ((TextView)findViewById(R.id.outputWeight)).setText(output5);
        ((TextView)findViewById(R.id.outputHeight)).setText(output6);
        ((TextView)findViewById(R.id.outputBloodType)).setText(output7);
        ((TextView)findViewById(R.id.outputAddress)).setText(output8);
    }
}