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

        Button skaz = (Button) findViewById(R.id.skaz);
        skaz.setOnClickListener(view -> {
            LevshaOkno.launch(this);
        });
        Button classic = (Button) findViewById(R.id.classic);
        classic.setOnClickListener(view -> {
            PlenKOkno.launch(this);
        });
        Button poaziya = (Button) findViewById(R.id.poaziya);
        poaziya.setOnClickListener(view -> {
            MozartOkno.launch(this);
        });
        Button menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, SettingsAcc.class);
            startActivity(startActivity);
        });
    }
}
