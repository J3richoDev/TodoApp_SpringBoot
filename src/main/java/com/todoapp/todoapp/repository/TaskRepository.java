package com.todoapp.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.todoapp.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    
}
