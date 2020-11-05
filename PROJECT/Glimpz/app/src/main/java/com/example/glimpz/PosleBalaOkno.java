package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glimpz.data.Liked;

public class PosleBalaOkno extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.posle_bala_okno);
        Button bal_now = findViewById(R.id.bal_now);
        bal_now.setOnClickListener(view -> SelectModeActivity.launch(this, Book.Ball));
        Button newtest = findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, Book.Ball, bal_now.getText().toString()));
        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });
        findViewById(R.id.like).setOnClickListener(view -> Liked.likeBook(Book.Ball));
    }

    public static void launch(Context context) {
        Intent startActivity = new Intent(context, PosleBalaOkno.class);
        context.startActivity(startActivity);
    }
}
