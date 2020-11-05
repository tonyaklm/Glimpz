package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glimpz.data.Liked;

public class MozartOkno extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mozart_okno);

        Button mozart_now = findViewById(R.id.mozart_now);
        mozart_now.setOnClickListener(view -> SelectModeActivity.launch(this, Book.Mozart));
        Button newtest = findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, Book.Mozart, mozart_now.getText().toString()));

        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });

        findViewById(R.id.like).setOnClickListener(view -> Liked.likeBook(Book.Mozart));
    }

    public static void launch(Context context) {
        Intent startActivity = new Intent(context, MozartOkno.class);
        context.startActivity(startActivity);
    }
}
