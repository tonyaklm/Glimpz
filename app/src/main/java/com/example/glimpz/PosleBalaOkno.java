package com.example.glimpz;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PosleBalaOkno extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.posle_bala_okno);
        Button bal_now = findViewById(R.id.bal_now);
        bal_now.setOnClickListener(view -> SelectModeActivity.launch(this, Book.Ball));
        Button newtest = findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, Book.Ball, bal_now.getText().toString()));
    }
}
