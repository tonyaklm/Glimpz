package com.example.glimpz.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.glimpz.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Results {

    private static final String RESULTS_KEY = "Key.Results";
    private static final Map<Book, BookResult> EMPTY = new HashMap<>();

    private static SharedPreferences prefs;

    public static void init(Context context) {
        prefs = context.getSharedPreferences(Users.getCurrentUserLogin(), Context.MODE_PRIVATE);
    }

    public static List<BookResult> getResults() {
        return new ArrayList<>(loadResults().values());
    }

    public static void updateBookSpeed(Book book, double avgPageTime) {
        Map<Book, BookResult> results = loadResults();
        BookResult result = results.get(book);
        if (result == null) {
            result = new BookResult(book, avgPageTime);
        } else {
            result = result.updateAvgPageTime(avgPageTime);
        }
        results.put(book, result);
        updateResults(results);
    }

    public static void updateBookTest(Book book, int correct, int total) {
        Map<Book, BookResult> results = loadResults();
        BookResult result = results.get(book);
        if (result == null) {
            result = new BookResult(book, correct, total);
        } else {
            result = result.updateTestResult(correct, total);
        }
        results.put(book, result);
        updateResults(results);
    }

    private static Map<Book, BookResult> loadResults() {
        String text = prefs.getString(RESULTS_KEY, null);
        return (Map<Book, BookResult>) ObjectDecoder.fromString(text, EMPTY);
    }

    private static void updateResults(Map<Book, BookResult> results) {
        prefs.edit()
                .putString(RESULTS_KEY, ObjectDecoder.toString(results))
                .apply();
    }
}
