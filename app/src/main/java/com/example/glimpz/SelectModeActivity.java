package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SelectModeActivity extends AppCompatActivity {

    private static final String ARG_BOOK = "Arg.Book";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);
        findViewById(R.id.plain).setOnClickListener(view -> launchLibrary(false));
        findViewById(R.id.speed).setOnClickListener(view -> launchLibrary(true));
    }

    private void launchLibrary(boolean speedReading) {
        Book book = (Book) getIntent().getSerializableExtra(ARG_BOOK);
        Library.launch(this, speedReading, book);
    }

    public static void launch(Context context, Book book) {
        Intent intent = new Intent(context, SelectModeActivity.class);
        intent.putExtra(ARG_BOOK, book);
        context.startActivity(intent);
    }
}
