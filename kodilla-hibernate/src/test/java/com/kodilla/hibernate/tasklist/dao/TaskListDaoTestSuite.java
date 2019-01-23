package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "TaskList";

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, "TaskList0");

        //When
        taskListDao.save(taskList);

        //Then
        String listName = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        Assert.assertEquals("TaskList", readTaskList.get(0).getListName());
        Assert.assertEquals("TaskList0", readTaskList.get(0).getDescription());

        //CleanUp
        taskListDao.delete(taskList);
    }
}
