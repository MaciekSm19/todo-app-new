package com.example.todo_app_new.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@Entity
@Table(name = "project_steps")
public class ProjectStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Project step's description must not be empty")
    private String description;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    private Integer daysToDeadline;

    public ProjectStep() {}

    public Integer getId() {
        return id;
    }

    void setId(final Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    void setDescription(final String description) {
        this.description = description;
    }

    Project getProject() {
        return project;
    }

    void setProject(final Project project) {
        this.project = project;
    }

    public Integer getDaysToDeadline() {
        return daysToDeadline;
    }

    void setDaysToDeadline(final Integer daysToDeadline) {
        this.daysToDeadline = daysToDeadline;
    }
}


