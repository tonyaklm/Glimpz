package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JunrUni extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junr_uni);

        Button adventure = (Button) findViewById(R.id.adventure);
        adventure.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, KillmanOkno.class);
            startActivity(startActivity);
        });
        Button classic = (Button) findViewById(R.id.classic);
        classic.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, PosleBalaOkno.class);
            startActivity(startActivity);
        });
        Button poem = (Button) findViewById(R.id.poem);
        poem.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, KnarOkno.class);
            startActivity(startActivity);
        });
    }
}
