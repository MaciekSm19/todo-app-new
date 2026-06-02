package com.example.todo_app_new.model.adapter;

import com.example.todo_app_new.model.Task;
import com.example.todo_app_new.model.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> {
    @Override
    @Query(nativeQuery = true, value = "select count(*) > 0 from TASKS where ID=:id")
    boolean existsById(@Param("id") Integer id);

    @Override
    @Query(nativeQuery = true, value = "select count(*) > 0 from TASKS join TASKS_GROUPS on TASKS.TASK_GROUP_ID = TASKS_GROUPS.ID where TASKS.ID=:id and TASKS.DONE = false")
    boolean existsByDoneIsFalseAndGroup_Id(@Param("id") Integer groupId);
}