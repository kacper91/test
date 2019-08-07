package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task executeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Coca-cola", 10.5);

            case PAINTING:
                return new PaintingTask("Painting", "blue", "Mouse");

            case DRIVING:
                return new DrivingTask("Driving", "Parking", "Car");

            default:
                return null;
        }

    }
}
