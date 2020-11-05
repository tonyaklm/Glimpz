package com.example.glimpz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.glimpz.screen.yourtests.YourTests;

public class AccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);

        Button test = findViewById(R.id.test);
        test.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, YourTests.class);
            startActivity(startActivity);
        });

        Button liked_book = findViewById(R.id.liked_book);
        liked_book.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, LikedBook.class);
            startActivity(startActivity);
        });
        Button my_level = findViewById(R.id.my_level);
        my_level.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, MyLevel.class);
            startActivity(startActivity);
        });
    }
}