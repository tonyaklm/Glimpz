package com.example.glimpz.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question implements Serializable {

    private final String text;
    private final String answer;
    private final ArrayList<String> wrongAnswers;
    private final ArrayList<String> shuffledAnswers;
    private final int correctAnswerIndex;

    public Question(
            String text,
            String answer,
            List<String> wrongAnswers
    ) {
        this.text = text;
        this.answer = answer;
        this.wrongAnswers = new ArrayList<>(wrongAnswers);
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
