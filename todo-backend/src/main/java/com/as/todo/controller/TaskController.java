package com.as.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.as.todo.model.Task;
import com.as.todo.service.TaskService;

@RestController
@CrossOrigin
@RequestMapping("/api/task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;

	@GetMapping("/hello")
	String helloWorld() {
		return "Hello, World from SpringBoot.";
	}
	
	@PostMapping
	Task createTask(@RequestBody Task task) {
		taskService.saveTask(task);
		return task;
	}
	
	@GetMapping
	List<Task> getAllTasks() {
		return taskService.findAllTask();
	}
	
	@PutMapping("/{id}")
	Task updateTask(@PathVariable Long id, @RequestBody Task task) {
		return taskService.updateTask(id, task);
	}
	
	@DeleteMapping("/{id}")
	void deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
	}
}
