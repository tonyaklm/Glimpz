package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glimpz.data.Liked;

import static com.example.glimpz.R.layout.levsha_okno;

public class LevshaOkno extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(levsha_okno);

        Button levsha_now = (Button) findViewById(R.id.levsha_now);
        levsha_now.setOnClickListener(view -> SelectModeActivity.launch(this, Book.Levsha));

        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });

        findViewById(R.id.like).setOnClickListener(view -> Liked.likeBook(Book.Levsha));
    }

    public static void launch(Context context) {
        Intent startActivity = new Intent(context, LevshaOkno.class);
        context.startActivity(startActivity);
    }
}
