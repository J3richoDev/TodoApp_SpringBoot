package com.todoapp.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.todoapp.todoapp.models.Task;
import com.todoapp.todoapp.services.TaskServices;

@Controller
public class TaskController {
    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices){
        this.taskServices = taskServices;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskServices.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "Task_List";
    }
}
