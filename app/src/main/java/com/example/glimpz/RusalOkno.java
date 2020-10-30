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

        Button rusal_now = (Button) findViewById(R.id.rusal_now);
        rusal_now.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, Library.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Rusal);
            startActivity(startActivity);
        });
        Button newtest = (Button) findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, rusal_now.getText().toString()));
    }
}
