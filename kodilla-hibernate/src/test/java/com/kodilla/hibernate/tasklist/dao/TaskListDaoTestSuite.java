package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import com.mysql.cj.protocol.TlsAsynchronousSocketChannel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {


    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "Test List";
    private static final String DESCRIPTION = "Test: CREATE TASKLISTS";

    @Test
    public void testFindByListName() {

        //Given

        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);
        int id = taskList.getId();
        String listnameTest = taskList.getListName();

        //When
        String readTasks = taskListDao.findByListName(listnameTest).toString();

        //Then
        Assert.assertEquals("["+NAME+"]", readTasks);

        //Cleanup
        taskListDao.deleteById(id);

    }

}
