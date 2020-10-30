package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsAcc extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_acc);

        Button beginer = (Button) findViewById(R.id.beginer);
        beginer.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, BeginerChoice.class);
            startActivity(startActivity);
        });
        Button medium= (Button) findViewById(R.id.medium);
        medium.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, MediumChoice.class);
            startActivity(startActivity);
        });
        Button uni = (Button) findViewById(R.id.uni);
        uni.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, UniChoice.class);
            startActivity(startActivity);
        });
    }
}
