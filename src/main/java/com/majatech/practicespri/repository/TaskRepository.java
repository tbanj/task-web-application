/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majatech.practicespri.repository;

import com.majatech.practicespri.domain.Tasks;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Engr. Temitope
 */
public interface TaskRepository extends CrudRepository<Tasks, Long> {
    
}
