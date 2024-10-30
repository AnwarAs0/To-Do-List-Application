package com.as.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.todo.model.Task;
import com.as.todo.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public void saveTask(Task task) {
		taskRepository.save(task);
		
	}

	public List<Task> findAllTask() {
		return taskRepository.findAll();
	}

	public Task updateTask(Long id, Task task) {
		task.setId(id);
		return taskRepository.save(task);
	}

	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
		
	}
}
