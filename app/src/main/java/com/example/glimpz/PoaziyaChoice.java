package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.glimpz.data.Users;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PoaziyaChoice extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poaziya_choice);
        Button mozart = (Button) findViewById(R.id.mozart);
        mozart.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, MozartOkno.class);
            startActivity(startActivity);
        });



    }

}
