package com.example.glimpz;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import androidx.appcompat.app.AppCompatActivity;


public class Library extends AppCompatActivity {

    public static final String ARG_BOOK = "Arg.Book";

    private String strCur = "";
    private TextView ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ball_book);
        ball = findViewById(R.id.ball);
        try {
            strCur = readBook();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Handler().postDelayed(() -> ball.setText(nextPageball()), 50);

        Button nextball = findViewById(R.id.nextball);
        nextball.setOnClickListener(view -> ball.setText(nextPageball()));
    }



    private String readBook() throws IOException {
        InputStream inputStream = getResources().openRawResource(getTextFileId());
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
        String eachline = bufferedReader.readLine();
        String text = "";
        while (eachline != null) {
            // the words in the file are separated by space, so to get each words
            text += eachline;
            text += "\n";
            eachline = bufferedReader.readLine();
        }
        return text;
    }
    String nextPageball() {
        String page = "";
        int i = 0;
        while (i < 25) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(ball.getTextSize());
            int pageSize = textPaint.breakText(strCur, true, ball.getWidth(), null);
            String line = strCur.substring(0, pageSize);
            page += line;
            strCur = strCur.substring(pageSize);
            i += Math.max(line.length() - line.replace("\n", "").length(), 1);
        }
        return page;
    }

    int getTextFileId() {
        Book book = (Book) getIntent().getSerializableExtra(ARG_BOOK);
        switch (book) {
            case Ball: return R.raw.book_ball;
            case Killman: return R.raw.killman_book;
            case Knar: return R.raw.knar_book;
            case Rusal: return R.raw.rusal;
            case Juk: return R.raw.juk_book;
            case Balda: return R.raw.balda;
            case Mozart: return R.raw.mozart;

        }
        throw new IllegalArgumentException("No book");
    }
}
