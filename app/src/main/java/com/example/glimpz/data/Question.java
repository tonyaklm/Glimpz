package com.example.glimpz.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Question implements Serializable {

    private String text;
    private String answer;
    private ArrayList<String> wrongAnswers;
    private ArrayList<String> shuffledAnswers;
    private int correctAnswerIndex;

    public Question(
            String text,
            String answer,
            ArrayList<String> wrongAnswers
    ) {
        this.text = text;
        this.answer = answer;
        this.wrongAnswers = wrongAnswers;
        correctAnswerIndex = new Random().nextInt(4) % 4;
        ArrayList<String> answers = new ArrayList<>(this.wrongAnswers);
        answers.add(correctAnswerIndex, answer);
        this.shuffledAnswers = answers;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getWrongAnswers() {
        return wrongAnswers;
    }

    public ArrayList<String> getShuffledAnswers() {
        return shuffledAnswers;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
