package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PoemChoice extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_choice);


        Button knar = (Button) findViewById(R.id.knar);
        knar.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, KnarOkno.class);

            startActivity(startActivity);
        });
    }
}
