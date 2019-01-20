package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testCreateShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buy batteries", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testCreatePaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Paint a landscape", painting.getTaskName());
        Assert.assertEquals(false, painting.isTaskExecuted());
        painting.executeTask();
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testCreateDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Journey", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
        driving.executeTask();
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}