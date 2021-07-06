package com.app.todolist.service;

import com.app.todolist.model.Task;
import com.app.todolist.repository.TaskRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryTaskServiceImpl implements QueryTaskService, GraphQLQueryResolver {

    private final TaskRepository taskRepository;

    public QueryTaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks(int count, int offset) {
        return taskRepository.findAll();
    }
}
