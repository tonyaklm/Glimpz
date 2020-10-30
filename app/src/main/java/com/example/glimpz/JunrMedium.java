package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JunrMedium extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junr_medium);

        Button fantasy = (Button) findViewById(R.id.adventure);
        fantasy.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, AdventureChoice.class);
            startActivity(startActivity);
        });
        Button classic = (Button) findViewById(R.id.classic);
        classic.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, ClassicChoice.class);
            startActivity(startActivity);
        });
        Button poem = (Button) findViewById(R.id.poem);
        poem.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, PoemChoice.class);
            startActivity(startActivity);
        });
    }
}
