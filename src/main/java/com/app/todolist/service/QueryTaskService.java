package com.app.todolist.service;

import com.app.todolist.model.Task;

import java.util.List;

public interface QueryTaskService {

    List<Task> getAllTasks(int count, int offset);
}
