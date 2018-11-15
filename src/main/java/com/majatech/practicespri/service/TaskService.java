/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majatech.practicespri.service;

import com.majatech.practicespri.domain.Tasks;

/**
 *
 * @author Engr. Temitope
 */
public interface TaskService {
    Iterable<Tasks> list();
    
    Tasks save(Tasks task);
    
}
