package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentsTasksTestSuite {

    @Test
    public void test() {
        //Given
        StudentsTasks adamTasks = new StudentsTasks("Adam");
        StudentsTasks marekTasks = new StudentsTasks("Marek");

        Mentor andrzej = new Mentor("Andrzej");
        Mentor jerzy = new Mentor("Jerzy");

        adamTasks.registerObserver(andrzej);
        marekTasks.registerObserver(jerzy);

        //When
        adamTasks.addTask("task1");
        adamTasks.addTask("task2");
        marekTasks.addTask("task3");

        //Then
        assertEquals(1, marekTasks.getUncheckedTask().size());
        assertEquals(2, adamTasks.getUncheckedTask().size());
    }
}