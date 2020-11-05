package com.example.glimpz;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;

import com.example.glimpz.data.Users;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starts_using);
        EditText loginView = findViewById(R.id.loginInput1);
        EditText passwordView = findViewById(R.id.passwordInput1);
        EditText emailView = findViewById(R.id.emailInput1);
        findViewById(R.id.register).setOnClickListener((view) -> {
            String login = loginView.getText().toString();
            String password = passwordView.getText().toString();
            String email = emailView.getText().toString();
            if (password.length() < 6 || password.length() > 20) {
                passwordView.setError("От 6 до 20 символов");
            } else {
                Users.register(login, password, email);
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
