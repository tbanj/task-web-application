/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majatech.practicespri.controller;

import com.majatech.practicespri.domain.Tasks;
import com.majatech.practicespri.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Engr. Temitope
 */
@RestController
@RequestMapping("api/task")
public class TaskController {
    
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    
    
    
//    it means localhost:8080 or localhost:8080/
    @GetMapping(value = {"","/"})
    public Iterable<Tasks> list() {
        return this.taskService.list();
    }
    
    @PostMapping("/save")
    public Tasks saveTask(@RequestBody Tasks task) {
        return this.taskService.save(task);
    }
    
}
