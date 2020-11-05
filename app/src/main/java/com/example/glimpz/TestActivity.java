package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.glimpz.data.Question;
import com.example.glimpz.data.Test;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    private static final String ARG_TEST = "Arg.Test";

    private int currentQuestionNumber = 0;
    private int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        currentQuestionNumber = 0;
        drawCurrentQuestion();
    }

    private void drawCurrentQuestion() {
        Test test = (Test) getIntent().getSerializableExtra(ARG_TEST);
        if (currentQuestionNumber >= test.getQuestionCount()) {
            TestResult.launch(this, correctAnswers, test.getQuestionCount());
            return;
        }
        Question question = test.getQuestions().get(currentQuestionNumber);
        TextView title = findViewById(R.id.title);
        Button option1 =findViewById(R.id.option1);
        Button option2 =findViewById(R.id.option2);
        Button option3 =findViewById(R.id.option3);
        Button option4 =findViewById(R.id.option4);
        title.setText(question.getText());
        ArrayList<String> answers = question.getShuffledAnswers();
        option1.setText(answers.get(0));
        option2.setText(answers.get(1));
        option3.setText(answers.get(2));
        option4.setText(answers.get(3));
        option1.setOnClickListener(view -> {
            ++currentQuestionNumber;
            if (question.getCorrectAnswerIndex() == 0) {
                ++correctAnswers;
            }
            drawCurrentQuestion();
        });
        option2.setOnClickListener(view -> {
            ++currentQuestionNumber;
            if (question.getCorrectAnswerIndex() == 1) {
                ++correctAnswers;
            }
            drawCurrentQuestion();
        });
        option3.setOnClickListener(view -> {
            ++currentQuestionNumber;
            if (question.getCorrectAnswerIndex() == 2) {
                ++correctAnswers;
            }
            drawCurrentQuestion();
        });
        option4.setOnClickListener(view -> {
            ++currentQuestionNumber;
            if (question.getCorrectAnswerIndex() == 3) {
                ++correctAnswers;
            }
            drawCurrentQuestion();
        });
    }

    public static void launch(Context context, Test test) {
        Intent startActivity = new Intent(context, TestActivity.class);
        startActivity.putExtra(ARG_TEST, test);
        context.startActivity(startActivity);
    }
}
