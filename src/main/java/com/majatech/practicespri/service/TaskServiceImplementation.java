/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majatech.practicespri.service;

import com.majatech.practicespri.domain.Tasks;
import com.majatech.practicespri.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Engr. Temitope
 */

@Service
public class TaskServiceImplementation implements TaskService{
    
    private TaskRepository taskRepository;

    /**
     * 
     * @param taskRepository
     */
    public TaskServiceImplementation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository; 
    } 
    
    /**
     *
     * @return
     */
    @Override
    public Iterable<Tasks> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Tasks save(Tasks task) {
        //To change body of generated methods, choose Tools | Templates.
        return this.taskRepository.save(task);
    }
}
