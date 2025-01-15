package com.todoapp.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.todoapp.todoapp.models.Task;
import com.todoapp.todoapp.services.TaskServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @PostMapping
    public String createTask(@RequestParam String title) {
        taskServices.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskServices.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/complete")
    public String completeTask(@PathVariable Long id){
        taskServices.completeTask(id);
        return "redirect:/";
    }
    
}
