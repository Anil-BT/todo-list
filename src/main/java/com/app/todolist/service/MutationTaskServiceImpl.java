package com.app.todolist.service;

import com.app.todolist.model.Task;
import com.app.todolist.model.TaskInput;
import com.app.todolist.repository.TaskRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MutationTaskServiceImpl implements MutationTaskService, GraphQLMutationResolver {

    private final TaskRepository taskRepository;

    public MutationTaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task saveTasks(TaskInput input) {
        Task task = new Task();
        task.setId(new Random().nextInt());
        task.setStatus("Pending");
        task.setCategory(input.getCategory());
        task.setTitle(input.getTitle());
        task.setDescription(input.getDescription());
        return taskRepository.save(task);
    }
}
