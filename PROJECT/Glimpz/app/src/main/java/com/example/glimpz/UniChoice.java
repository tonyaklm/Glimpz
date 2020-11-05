package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UniChoice extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uni_choice);

        Button yes = (Button) findViewById(R.id.yes);
        yes.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, ListBookUni.class);
            startActivity(startActivity);
        });
        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, JunrUni.class);
            startActivity(startActivity);
        });
    }
}
