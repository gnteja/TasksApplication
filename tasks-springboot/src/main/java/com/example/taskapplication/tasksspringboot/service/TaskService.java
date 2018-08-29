package com.example.taskapplication.tasksspringboot.service;

import com.example.taskapplication.tasksspringboot.domain.Task;

public interface TaskService {

	Iterable<Task> list();
	Task save(Task task);
}
