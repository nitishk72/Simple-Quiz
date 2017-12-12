package com.companyname.simplequiz;

/**
 * Created by Nitish Kumar Singh on 12-12-2017.
 */

public class Question {
    int id;
    String Question, OptionA, OptionB, OptionC,OptionD, CorrectOption;

    public Question(String question, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        Question = question;
        OptionA = optionA;
        OptionB = optionB;
        OptionC = optionC;
        OptionD = optionD;
        CorrectOption = correctOption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getOptionA() {
        return OptionA;
    }

    public void setOptionA(String optionA) {
        OptionA = optionA;
    }

    public String getOptionB() {
        return OptionB;
    }

    public void setOptionB(String optionB) {
        OptionB = optionB;
    }

    public String getOptionC() {
        return OptionC;
    }

    public void setOptionC(String optionC) {
        OptionC = optionC;
    }

    public String getOptionD() {
        return OptionD;
    }

    public void setOptionD(String optionD) {
        OptionD = optionD;
    }

    public String getCorrectOption() {
        return CorrectOption;
    }

    public void setCorrectOption(String correctOption) {
        CorrectOption = correctOption;
    }
}
