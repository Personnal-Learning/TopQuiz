package com.mortieresteban.topquiz.model;

import androidx.annotation.NonNull;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    public Question(@NonNull String question, @NonNull List<String> choiceList, int answerIndex) {
        mQuestion = question;
        mChoiceList = choiceList;
        mAnswerIndex = answerIndex;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    public void setChoiceList(List<String> mChoiceList) {
        this.mChoiceList = mChoiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int mAnswerIndex) {
        this.mAnswerIndex = mAnswerIndex;
    }
}
