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


        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, YourTests.class);
            startActivity(startActivity);
        });
        Button done = (Button) findViewById(R.id.done);
        done.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DoneBook.class);
            startActivity(startActivity);
        });
        Button liked_book = (Button) findViewById(R.id.liked_book);
        liked_book.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, LikedBook.class);
            startActivity(startActivity);
        });
        Button my_level = (Button) findViewById(R.id.my_level);
        my_level.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, MyLevel.class);
            startActivity(startActivity);
        });
    }
}