package com.example.glimpz.data;

import com.example.glimpz.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Results {

    private static final Map<Book, BookResult> results = new HashMap<>();

    public static List<BookResult> getResults() {
        return new ArrayList<>(results.values());
    }

    public static void updateBookSpeed(Book book, double avgPageTime) {
        BookResult result = results.get(book);
        if (result == null) {
            result = new BookResult(book, avgPageTime);
        } else {
            result = result.updateAvgPageTime(avgPageTime);
        }
        results.put(book, result);
    }

    public static void updateBookTest(Book book, int correct, int total) {
        BookResult result = results.get(book);
        if (result == null) {
            result = new BookResult(book, correct, total);
        } else {
            result = result.updateTestResult(correct, total);
        }
        results.put(book, result);
    }
}
