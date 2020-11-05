package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BaldaOkno extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balda_okno);

        Button balda_now = findViewById(R.id.balda_now);
        balda_now.setOnClickListener(view -> SelectModeActivity.launch(this, Book.Balda));
        Button newtest = findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, Book.Balda, balda_now.getText().toString()));

        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });
    }
}
