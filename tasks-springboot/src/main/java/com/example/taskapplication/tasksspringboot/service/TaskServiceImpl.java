package com.example.taskapplication.tasksspringboot.service;

import org.springframework.stereotype.Service;

import com.example.taskapplication.tasksspringboot.domain.Task;
import com.example.taskapplication.tasksspringboot.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepo;
	public TaskServiceImpl(TaskRepository taskRepo) {
		super();
		this.taskRepo = taskRepo;
	}


	@Override
	public Iterable<Task> list() {
		return taskRepo.findAll();
	}

	@Override
	public Task save(Task task) {
		return this.taskRepo.save(task);
	}
}
