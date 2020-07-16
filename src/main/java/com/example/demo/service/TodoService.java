package com.example.demo.service;


import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo saveProduct(Todo todo){
        return todoRepository.save(todo);
    }

    public List<Todo> getTodo(){
        return todoRepository.findAll();
    }

    public List<Todo> getTodoByFilter(String filter) {
        return todoRepository.findByCategory(filter);
    }

    public void deleteTodo(int id) {
        todoRepository.delete(todoRepository.findById(id));
    }

    public Todo getTodoById(int id) {
        return todoRepository.findById(id);
    }

    public Todo updateTodo(Todo todo) {
        Todo existingTodo = todoRepository.findById(todo.getId());
        existingTodo.setCategory(todo.getCategory());
        existingTodo.setCompleted(todo.getCompleted());
        existingTodo.setDescription(todo.getDescription());
        existingTodo.setItem(todo.getItem());
        return todoRepository.save(existingTodo);
    }
}
