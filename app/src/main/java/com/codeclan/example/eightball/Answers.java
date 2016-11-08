package com.codeclan.example.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 07/11/2016.
 */
// instance variables start with 'm' which is android convention
// protected - is not visible to public, but visible to current package
// and any packages inherteted from it

public class Answers implements Answerable {
    // protected so that it is not visible outside
    protected ArrayList<String> mAnswers;

    public Answers(){
        mAnswers = new ArrayList<String>();
        setupAnswers();
    }

    public Answers(ArrayList<String> existingAnswers){
        //make a brand new version of mAnswers
        mAnswers = new ArrayList<String>(existingAnswers);

    }

    //return a clone of mAnswers so user cant change it
    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(mAnswers);
    }

    private void setupAnswers(){
        // { } brackets for Array
        String[] answers = {
                "Yes",
                "No",
                "Maybe",
                "I don't know",
                "Can you repeat the question?",
                "Possibly"
        };
        for (String answer : answers){
            add(answer);
        }
    }

    public void add(String newAnswer) {
        mAnswers.add(newAnswer);
    }

    public int getLength(){
        return mAnswers.size();
    }

    public String getAnswerAtIndex(int index){
        return mAnswers.get(index);
    }

    public String getAnswer(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
        return answer;
    }
}
