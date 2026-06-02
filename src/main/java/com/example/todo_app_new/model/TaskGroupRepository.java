package com.example.todo_app_new.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskGroupRepository {
    List<TaskGroup> findAll();
    Optional<TaskGroup> findById(Integer id);
    boolean existsByDoneIsFalseAndProjectId(Integer projectId);
    TaskGroup save(TaskGroup entity);
    boolean existsById(Integer id);
}

