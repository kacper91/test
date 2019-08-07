package com.kodilla.patterns.factory.tasks;

import java.awt.*;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isTaskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;

        executeTask();

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
