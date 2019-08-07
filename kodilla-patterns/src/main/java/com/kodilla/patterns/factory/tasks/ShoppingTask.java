package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isTaskExecuted = false;


    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
    this.taskName = taskName;
    this.whatToBuy = whatToBuy;
    this.quantity = quantity;
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
