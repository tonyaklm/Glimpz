package com.example.glimpz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.glimpz.data.Question;
import com.example.glimpz.data.Test;
import com.example.glimpz.screen.yourtests.YourTests;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class NewTest extends AppCompatActivity {

    private static final String ARG_BOOK_TITLE = "Arg.NewTest";
    private static Test test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_test);
        String bookTitle = getIntent().getStringExtra(ARG_BOOK_TITLE);
        if (bookTitle != null) {
            test = new Test(bookTitle);
        }
        Button newpage = (Button) findViewById(R.id.newpage);
        if (test.getQuestionCount() == 4) {
            newpage.setVisibility(View.GONE);
        }
        newpage.setOnClickListener(view -> {
            addQuestion();
            Intent startActivity = new Intent(this, NewTest.class);
            startActivity(startActivity);
        });
        Button finishbutton = (Button) findViewById(R.id.finishbutton);
        if (test.getQuestionCount() != 4) {
            finishbutton.setVisibility(View.GONE);
        }
        finishbutton.setOnClickListener(view -> {
            addQuestion();
            YourTests.tests.add(test);
            test = new Test(bookTitle);
            Intent startActivity = new Intent(this, YourTests.class);
            startActivity(startActivity);
        });
    }

    private void addQuestion() {
        EditText questionInput = findViewById(R.id.questionInput1);
        EditText answer = findViewById(R.id.questionPrint1);
        EditText wrongAnswer1 = findViewById(R.id.questionPrint2);
        EditText wrongAnswer2 = findViewById(R.id.questionPrint3);
        EditText wrongAnswer3 = findViewById(R.id.questionPrint4);
        ArrayList<String> wrongAnswers = new ArrayList<>();
        wrongAnswers.add(wrongAnswer1.getText().toString());
        wrongAnswers.add(wrongAnswer2.getText().toString());
        wrongAnswers.add(wrongAnswer3.getText().toString());
        Question question = new Question(
                questionInput.getText().toString(),
                answer.getText().toString(),
                wrongAnswers
        );
        test.addQuestion(question);
    }

    public static void start(Activity activity, String bookTitle) {
        Intent intent = new Intent(activity, NewTest.class);
        intent.putExtra(ARG_BOOK_TITLE, bookTitle);
        activity.startActivity(intent);
    }
}

