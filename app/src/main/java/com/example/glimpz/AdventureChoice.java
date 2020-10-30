package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdventureChoice extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adventure_choice);

        Button  killman = (Button) findViewById(R.id.killman);
        killman.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, KillmanOkno.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Killman);
            startActivity(startActivity);
        });
    }
}

