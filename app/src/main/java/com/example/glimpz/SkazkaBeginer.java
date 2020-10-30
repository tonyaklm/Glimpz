package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SkazkaBeginer extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skazka_beginer);

        Button  rusal = (Button) findViewById(R.id.rusal);
        rusal.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, RusalOkno.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Rusal);
            startActivity(startActivity);
        });
    }
}
