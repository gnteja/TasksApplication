package com.example.taskapplication.tasksspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskapplication.tasksspringboot.domain.Task;
import com.example.taskapplication.tasksspringboot.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}

	@GetMapping(value={"","/"})
	public Iterable<Task> list(){
		return taskService.list();
	}
	
	@PostMapping("/save")
	public Task save(@RequestBody Task task) {
		return this.taskService.save(task);
	}
}
