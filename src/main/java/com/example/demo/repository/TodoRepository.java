package com.example.demo.repository;

import com.example.demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, InternalError> {

    public List<Todo> findByCategory(String category);

    public Todo findById(int id);

//    @Query("SELECT appUser FROM AppUser appUser WHERE appUser.id=:x")
//    public AppUser findUserById(@Param("x") Long id);
}
