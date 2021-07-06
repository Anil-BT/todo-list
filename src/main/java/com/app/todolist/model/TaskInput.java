package com.app.todolist.model;

import lombok.Data;

@Data
public class TaskInput {
    private String title;
    private String description;
    private String category;
}
