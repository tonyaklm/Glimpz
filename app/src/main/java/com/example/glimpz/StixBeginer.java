package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StixBeginer extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stix_beginer);

        Button  balda = (Button) findViewById(R.id.balda);
        balda.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, BaldaOkno.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Balda);
            startActivity(startActivity);
        });
    }
}
