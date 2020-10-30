package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ClassicChoice extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classic_choice);

        Button bal = (Button) findViewById(R.id.bal);
        bal.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, PosleBalaOkno.class);
            startActivity(startActivity);
        });




    }
}

