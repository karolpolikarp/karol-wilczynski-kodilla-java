package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StudentsTasks implements Observable {

    private final List<Observer> observers;
    private final String studentsName;
    private final Queue<String> uncheckedTask;

    public StudentsTasks(String studentsName) {
        observers = new ArrayList<>();
        uncheckedTask = new LinkedList<>();
        this.studentsName = studentsName;
    }

    public void addTask(String task) {
        uncheckedTask.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getName() {
        return studentsName;
    }

    public Queue<String> getUncheckedTask() {
        return uncheckedTask;
    }
}