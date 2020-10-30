package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.glimpz.AccActivity;
import com.example.glimpz.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JunrUni extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junr_uni);

        Button romance = (Button) findViewById(R.id.romance);
        romance.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, RomanceChoice.class);
            startActivity(startActivity);
        });
        Button delovaya = (Button) findViewById(R.id.delovaya);
        delovaya.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DelovayaChoice.class);
            startActivity(startActivity);
        });
        Button poaziya = (Button) findViewById(R.id.poaziya);
        poaziya.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, PoaziyaChoice.class);
            startActivity(startActivity);
        });
    }
}
