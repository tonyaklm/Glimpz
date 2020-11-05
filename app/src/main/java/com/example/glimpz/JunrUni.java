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
            KillmanOkno.launch(this);
        });
        Button classic = (Button) findViewById(R.id.classic);
        classic.setOnClickListener(view -> {
            PosleBalaOkno.launch(this);
        });
        Button poem = (Button) findViewById(R.id.poem);
        poem.setOnClickListener(view -> {
            KnarOkno.launch(this);
        });
        Button menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, SettingsAcc.class);
            startActivity(startActivity);
        });
    }
}
