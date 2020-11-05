package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KnarOkno extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knar_okno);

        Button knar_now = findViewById(R.id.knar_now);
        knar_now.setOnClickListener(view -> SelectModeActivity.launch(this, Book.Knar));
        Button newtest = findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, Book.Killman, knar_now.getText().toString()));

        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });
    }
}
