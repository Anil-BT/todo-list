package com.app.todolist.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("task")
@Data
public class Task {
    @PrimaryKey
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String category;
    @Column
    private String status;
}
