package com.example.glimpz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.glimpz.screen.yourtests.YourTests;

public class AccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);


        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, YourTests.class);
            startActivity(startActivity);
        });

    }

}