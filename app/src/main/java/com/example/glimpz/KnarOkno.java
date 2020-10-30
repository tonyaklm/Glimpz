package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KnarOkno extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knar_okno);

        Button knar_now = (Button) findViewById(R.id.knar_now);
        knar_now.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, Library.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Knar);
            startActivity(startActivity);
        });
        Button newtest = (Button) findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, knar_now.getText().toString()));
    }
}
