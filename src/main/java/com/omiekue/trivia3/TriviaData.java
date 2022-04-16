package com.omiekue.trivia3;

import java.util.ArrayList;
import java.util.List;

public class TriviaData {

    private String question;
    private String answer;

    public TriviaData(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }

}
