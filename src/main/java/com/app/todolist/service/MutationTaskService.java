package com.app.todolist.service;

import com.app.todolist.model.Task;
import com.app.todolist.model.TaskInput;

public interface MutationTaskService {
    Task saveTasks(TaskInput input);
}
