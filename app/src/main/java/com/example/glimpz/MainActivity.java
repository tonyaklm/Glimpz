package com.example.glimpz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.glimpz.data.Results;
import com.example.glimpz.data.TestStore;
import com.example.glimpz.data.Users;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Users.init(this);
        TestStore.init(this);
        Results.init(this);
        setContentView(R.layout.activity_login);

        TextView loginView = findViewById(R.id.login);
        TextView passwordView = findViewById(R.id.password);
        findViewById(R.id.enter).setOnClickListener((view) -> {
            String login = loginView.getText().toString();
            String password = passwordView.getText().toString();
            if (Users.login(login, password)) {
                Intent intent = new Intent(this, DashboardActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.forgot_password).setOnClickListener((view) -> {
            Intent intent = new Intent(this, RegistrationActivity.class);
            startActivity(intent);
        });
    }

}