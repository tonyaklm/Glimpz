package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glimpz.data.Liked;

public class PlenKOkno extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plenk_now);

        Button plenk_now = findViewById(R.id.plenk_now);
        plenk_now.setOnClickListener(view -> SelectModeActivity.launch(this,  Book.Plenk));
        Button newtest = findViewById(R.id.newtest);
        newtest.setOnClickListener(view -> Rules.start(this, Book.Plenk, plenk_now.getText().toString()));

        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, DashboardActivity.class);
            startActivity(startActivity);
        });

        findViewById(R.id.like).setOnClickListener(view -> Liked.likeBook(Book.Plenk));
    }

    public static void launch(Context context) {
        Intent startActivity = new Intent(context, PlenKOkno.class);
        context.startActivity(startActivity);
    }
}
