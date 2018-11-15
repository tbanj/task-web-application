/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majatech.practicespri.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Tasks {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Boolean completed;
    private LocalDate dueDate;
    

    public Tasks() {

    }

}
