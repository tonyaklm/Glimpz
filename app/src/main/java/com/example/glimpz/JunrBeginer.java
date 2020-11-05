package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JunrBeginer extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junr_beginer);

        Button adventure = (Button) findViewById(R.id.adventure);
        adventure.setOnClickListener(view -> {
            JukOkno.launch(this);
        });
        Button skazka = (Button) findViewById(R.id.skazka);
        skazka.setOnClickListener(view -> {
            RusalOkno.launch(this);
        });
        Button stix= (Button) findViewById(R.id.stix);
        stix.setOnClickListener(view -> {
            BaldaOkno.launch(this);
        });
        Button menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, SettingsAcc.class);
            startActivity(startActivity);
        });
    }
}
