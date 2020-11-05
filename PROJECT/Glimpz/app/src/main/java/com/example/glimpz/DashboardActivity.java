package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.glimpz.data.Users;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button acc = (Button) findViewById(R.id.acc);
        acc.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, AccActivity.class);
            startActivity(startActivity);
        });

        Button lib = (Button) findViewById(R.id.lib);
        lib.setOnClickListener(view -> {
            Intent startActivity = new Intent(this, SettingsAcc.class);
            startActivity(startActivity);
        });
    }

}
