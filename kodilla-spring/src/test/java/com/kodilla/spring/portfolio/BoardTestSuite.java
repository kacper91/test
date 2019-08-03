package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("zad1");
        board.getToDoList().getTasks().add("zad2");

        //Then
        Assert.assertEquals(2, board.getToDoList().getTasks().size());
        Assert.assertEquals(0, board.getDoneList().getTasks().size());
        Assert.assertEquals(0, board.getInProgressList().getTasks().size());

    }

}
