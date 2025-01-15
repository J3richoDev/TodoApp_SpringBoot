package com.todoapp.todoapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todoapp.todoapp.models.Task;
import com.todoapp.todoapp.repository.TaskRepository;

@Service
public class TaskServices {

    private final TaskRepository taskRepository;

    public TaskServices(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

}
