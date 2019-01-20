package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy batteries", "AAA", 1);
            case PAINTING:
                return new PaintingTask("Paint a landscape", "multiple", "mountains");
            case DRIVING:
                return new DrivingTask("Journey", "Berlin", "car");
            default:
                return null;
        }
    }
}