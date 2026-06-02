package com.example.todo_app_new.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

@Embeddable
class Audit {
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;


    @PrePersist
    void prePersist() {
        this.createdOn = LocalDateTime.now();
    }

    @PreUpdate
    void preMerge() {
        this.updatedOn = LocalDateTime.now();
    }
}
