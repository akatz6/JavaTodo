package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PREP_TODO")
public class Todo {

    @Id
    @GeneratedValue
    private int id;
    private String item;
    private String category;
    private String description;
    private boolean completed;

    public boolean getCompleted() {
        return completed;
    }
}
