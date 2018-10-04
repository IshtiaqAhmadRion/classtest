package com.example.user.classtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {

    TextView textViewdit, textView;
    Spinner spinner;
    String det = "Not Found";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textView = findViewById(R.id.detId);
        textViewdit = findViewById(R.id.tVdetId);
        //spinner = findViewById(R.id.spinnerId);

        if(det.equalsIgnoreCase("Bangladesh")){
            textViewdit.setText(getText(R.string.Bangladesh));
        }

        if(det.equalsIgnoreCase("india")){
            textViewdit.setText(getText(R.string.India));
        }

        if(det.equalsIgnoreCase("pakisthan")){
            textViewdit.setText(getText(R.string.Pakisthan));
        }
        if(det.equalsIgnoreCase("america")){
            textViewdit.setText(getText(R.string.America));
        }
        if(det.equalsIgnoreCase("Singapur")){
            textViewdit.setText(getText(R.string.Singapur));
        }









    }
}
