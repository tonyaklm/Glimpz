package com.example.glimpz;

import android.content.Context;
import android.content.Intent;
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

import com.example.glimpz.screen.yourtests.YourTests;


public class Library extends AppCompatActivity {

    private static final String ARG_SPEED_READING = "Arg.SpeedReading";
    private static final String ARG_BOOK = "Arg.Book";

    private final Handler handler = new Handler();
    private String strCur = "";
    private TextView bookText;
    private TextView timeLeft;
    private int currentPageReadingTime = 0;
    private int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_library);
        bookText = findViewById(R.id.bookText);
        timeLeft = findViewById(R.id.timeLeft);
        try {
            strCur = readBook();
        } catch (IOException e) {
            e.printStackTrace();
        }
        read();
    }

    private void read() {
        boolean isSpeedReading = getIntent().getBooleanExtra(ARG_SPEED_READING, false);
        Button nextPage = findViewById(R.id.nextball);
        if (isSpeedReading) {
            handler.postDelayed(() -> recalculatePageReadingTime(false), 50);
            nextPage.setOnClickListener(view -> recalculatePageReadingTime(true));
        } else {
            handler.postDelayed(() -> reloadPage(), 50);
            nextPage.setOnClickListener(view -> reloadPage());
        }
    }

    private void recalculatePageReadingTime(boolean forceNextPage) {
        if (currentPageReadingTime == 0 || forceNextPage) {
            renderNextPage();
        } else {
            updateTimer();
        }
        handler.postDelayed(() -> recalculatePageReadingTime(false), 1000);
    }

    private int getCurrentPageReadingTime() {
        return Math.max(15, 32 - currentPage / 10);
    }

    private void renderNextPage() {
        currentPageReadingTime = getCurrentPageReadingTime();
        handler.removeCallbacksAndMessages(null);
        reloadPage();
        ++currentPage;
        updateTimer();
    }

    private void updateTimer() {
        timeLeft.setText("Осталось " + currentPageReadingTime + " секунд");
        currentPageReadingTime -= 1;
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

    private void reloadPage() {
        String page = getNextPage();
        if (page.isEmpty()) {
            YourTests.launch(this, getBook());
        } else {
            bookText.setText(page);
        }
    }

    private String getNextPage() {
        String page = "";
        int i = 0;
        while (i < 25) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(bookText.getTextSize());
            int pageSize = textPaint.breakText(strCur, true, bookText.getWidth(), null);
            String line = strCur.substring(0, pageSize);
            page += line;
            strCur = strCur.substring(pageSize);
            i += Math.max(line.length() - line.replace("\n", "").length(), 1);
        }
        return page;
    }

    int getTextFileId() {
        switch (getBook()) {
            case Ball: return R.raw.book_ball;
            case Killman: return R.raw.killman_book;
            case Knar: return R.raw.knar_book;
            case Rusal: return R.raw.rusal;
            case Juk: return R.raw.juk_book;
            case Balda: return R.raw.balda;
            case Mozart: return R.raw.mozart;
            case Plenk: return R.raw.plenk;
            case Levsha: return R.raw.levsha;
        }
        throw new IllegalArgumentException("No book");
    }

    private Book getBook() {
        return (Book) getIntent().getSerializableExtra(ARG_BOOK);
    }

    public static void launch(Context context, boolean speedReading, Book book) {
        Intent intent = new Intent(context, Library.class);
        intent.putExtra(ARG_SPEED_READING, speedReading);
        intent.putExtra(ARG_BOOK,  book);
        context.startActivity(intent);
    }
}
