package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentsTasks studentsTasks) {
        System.out.println(mentorName + ": New task to check by " + studentsTasks.getName() + "\n" +
                " (total: " + studentsTasks.getUncheckedTask().size() + " tasks");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}