package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RusalOkno extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rusal_okno);

        Button rusal_now = findViewById(R.id.rusal_now);
        rusal_now.setOnClickListener(view -> SelectModeActivity.launch(this, Book.Rusal));
        Button newtest = findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, Book.Rusal, rusal_now.getText().toString()));

        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });
    }
}
