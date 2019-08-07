package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.executeTask(TaskFactory.DRIVING);
        System.out.println(driving.isTaskExecuted());

        //Then
        Assert.assertEquals("Driving", driving.getTaskName());

    }

    @Test
    public void testPaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.executeTask(TaskFactory.PAINTING);
        System.out.println(painting.isTaskExecuted());

        //Then
        Assert.assertEquals("Painting", painting.getTaskName());

    }

    @Test
    public void testShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.executeTask(TaskFactory.SHOPPING);
        System.out.println(shopping.isTaskExecuted());

        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());

    }


}
