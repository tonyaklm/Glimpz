package com.example.glimpz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Rules extends AppCompatActivity {

    private static final String ARG_BOOK_TITLE = "Arg.BookTitle";
    private static final String ARG_BOOK = "Arg.Book";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);

        Button agree = findViewById(R.id.agree);
        String bookTitle = getIntent().getStringExtra(ARG_BOOK_TITLE);
        agree.setOnClickListener(view -> NewTest.start(this, getBook(), bookTitle));
    }

    private Book getBook() {
        return (Book) getIntent().getSerializableExtra(ARG_BOOK);
    }

    public static void start(Activity activity, Book book, String bookTitle) {
        Intent intent = new Intent(activity, Rules.class);
        intent.putExtra(ARG_BOOK_TITLE, bookTitle);
        intent.putExtra(ARG_BOOK, book);
        activity.startActivity(intent);
    }
}
