package com.example.todo_app_new.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();
    Optional<Task> findById(Integer id);
    List<Task> findTaskByDone(@Param("state") boolean done);
    Page<Task> findAll(Pageable page);
    Task save(Task entity);
    boolean existsById(Integer id);
}

