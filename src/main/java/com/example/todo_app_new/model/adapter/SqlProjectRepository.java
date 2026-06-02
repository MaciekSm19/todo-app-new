package com.example.todo_app_new.model.adapter;

import com.example.todo_app_new.model.Project;
import com.example.todo_app_new.model.ProjectRepository;
import com.example.todo_app_new.model.TaskGroup;
import com.example.todo_app_new.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override
    @Query("select distinct from Project p join fetch p.steps")
    List<Project> findAll();
}