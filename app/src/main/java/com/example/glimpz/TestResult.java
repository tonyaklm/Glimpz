package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestResult extends AppCompatActivity {

    private static final String ARG_CORRECT_ANSWERS = "Arg.CorrectAnswers";
    private static final String ARG_TOTAL_QUESTIONS = "Arg.TotalQuestions";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);
        TextView result = findViewById(R.id.result);
        int correctAnswers = getIntent().getIntExtra(ARG_CORRECT_ANSWERS, 0);
        int totalQuestions = getIntent().getIntExtra(ARG_TOTAL_QUESTIONS, 0);
        result.setText("Правильных ответов: " + correctAnswers + "/" + totalQuestions);
    }

    public static void launch(Context context, int correctAnswers, int totalQuestions) {
        Intent intent = new Intent(context, TestResult.class);
        intent.putExtra(ARG_CORRECT_ANSWERS, correctAnswers);
        intent.putExtra(ARG_TOTAL_QUESTIONS, totalQuestions);
        context.startActivity(intent);
    }
}
