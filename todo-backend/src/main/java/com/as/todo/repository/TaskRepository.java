package com.as.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.todo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
