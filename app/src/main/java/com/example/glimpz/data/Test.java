package com.example.glimpz.data;

import java.io.Serializable;
import java.util.ArrayList;

public class Test implements Serializable {

    private final String title;
    private final ArrayList<Question> questions;

    public Test(
            String title,
            ArrayList<Question> questions
    ) {
        this.title = title;
        this.questions = new ArrayList<>(questions);
    }

    public Test(String title) {
        this(title, new ArrayList<>());
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public int getQuestionCount() {
        return questions.size();
    }

    public String getTitle() {
        return title;
    }
}

