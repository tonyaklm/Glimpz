package com.example.glimpz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Rules extends AppCompatActivity {

    private static final String ARG_BOOK_TITLE = "Arg.BookTitle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);

        Button agree = (Button) findViewById(R.id.agree);
        String bookTitle = getIntent().getStringExtra(ARG_BOOK_TITLE);
        agree.setOnClickListener(view -> NewTest.start(this, bookTitle));
    }

    public static void start(Activity activity, String bookTitle) {
        Intent intent = new Intent(activity, Rules.class);
        intent.putExtra(ARG_BOOK_TITLE, bookTitle);
        activity.startActivity(intent);
    }
}
