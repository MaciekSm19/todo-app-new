package com.example.todo_app_new.model;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    List<Project> findAll();
    Optional<Project> findById(Integer id);
    Project save(Project entity);
    boolean existsById(Integer id);
}

