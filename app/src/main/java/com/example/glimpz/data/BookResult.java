package com.example.glimpz.data;

import com.example.glimpz.Book;

public class BookResult {

    private final Book book;
    private final double avgPageTime;
    private final int lastTestTotal;
    private final int lastTestCorrect;

    public BookResult(Book book, double avgPageTime, int lastTestCorrect, int lastTestTotal) {
        this.book = book;
        this.avgPageTime = avgPageTime;
        this.lastTestTotal = lastTestTotal;
        this.lastTestCorrect = lastTestCorrect;
    }

    public BookResult(Book book, double avgPageTime) {
        this(book, avgPageTime, -1, -1);
    }

    public BookResult(Book book, int lastTestCorrect, int lastTestTotal) {
        this(book, -1, lastTestCorrect, lastTestTotal);
    }

    public Book getBook() {
        return book;
    }

    public double getAvgPageTime() {
        return avgPageTime;
    }

    public int getLastTestCorrect() {
        return lastTestCorrect;
    }

    public int getLastTestTotal() {
        return lastTestTotal;
    }

    public BookResult updateAvgPageTime(double avgTime) {
        return new BookResult(this.book, avgTime, this.lastTestCorrect, this.lastTestCorrect);
    }

    public BookResult updateTestResult(int correct, int total) {
        return new BookResult(this.book, this.avgPageTime, correct, total);
    }
}
