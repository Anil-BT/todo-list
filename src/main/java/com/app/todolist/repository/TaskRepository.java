package com.app.todolist.repository;

import com.app.todolist.model.Task;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TaskRepository extends CassandraRepository<Task, Long> {
}
