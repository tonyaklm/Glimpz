package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BaldaOkno extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balda_okno);

        Button balda_now = (Button) findViewById(R.id.balda_now);
        balda_now.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, Library.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Balda);
            startActivity(startActivity);
        });
        Button newtest = (Button) findViewById(R.id.newtest);
        newtest.setOnClickListener(view ->
                Rules.start(this, balda_now.getText().toString()));

        Button menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });
    }

}
