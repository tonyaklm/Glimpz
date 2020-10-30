package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdventureBeginer extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adventure_beginer);

        Button  juk = (Button) findViewById(R.id.juk);
        juk.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, JukOkno.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Juk);
            startActivity(startActivity);
        });
    }
}
