package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListBookUni extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_book_uni);
        Button next = findViewById(R.id.next);
        next.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, JunrMedium.class);
            startActivity(startActivity);
        });
    }
}
