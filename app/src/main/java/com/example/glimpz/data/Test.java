package com.example.glimpz.data;

import com.example.glimpz.Book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test implements Serializable {

    private final Book book;
    private final String title;
    private final ArrayList<Question> questions;

    public Test(
            Book book,
            String title,
            List<Question> questions
    ) {
        this.book = book;
        this.title = title;
        this.questions = new ArrayList<>(questions);
    }

    public Test(
            Book book,
            String title
    ) {
        this(book, title, new ArrayList<>());
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public Book getBook() {
        return this.book;
    }

    public int getQuestionCount() {
        return questions.size();
    }

    public String getTitle() {
        return title;
    }
}

