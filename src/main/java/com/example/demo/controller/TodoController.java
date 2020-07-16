package com.example.demo.controller;


import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoRepository;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;
    private TodoRepository todoRepository;


    @PostMapping("/addTodo")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.saveProduct(todo);
    }

    @GetMapping("/all-todos")
    public List<Todo> findAllTodos(){
        return todoService.getTodo();
    }

    @GetMapping("/all-todos/{filter}")
    public List<Todo> findTodoById(@PathVariable String filter){
        return todoService.getTodoByFilter(filter);
    }

    @GetMapping("/edit-todo/{id}")
    public Todo findTodoByCategory(@PathVariable int id){
        return todoService.getTodoById(id);
    }

    @PutMapping("/update-todo")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/all-todos/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
    }
}
