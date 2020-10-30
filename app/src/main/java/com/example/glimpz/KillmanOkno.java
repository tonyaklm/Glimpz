package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class KillmanOkno extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.killman_okno);

        Button killman_now = (Button) findViewById(R.id.killman_now);
        killman_now.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, Library.class);
            startActivity.putExtra(Library.ARG_BOOK, Book.Killman);
            startActivity(startActivity);
        });
        Button newtest = (Button) findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, killman_now.getText().toString()));
    }
}