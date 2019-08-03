package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class BoardConfig {

    @Bean
    @Scope("prototype")
    public TaskList getTaskList(){

        return new TaskList();

    }


}
