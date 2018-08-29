package com.example.taskapplication.tasksspringboot;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.taskapplication.tasksspringboot.domain.Task;
import com.example.taskapplication.tasksspringboot.service.TaskService;

@SpringBootApplication
public class TasksSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksSpringbootApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(TaskService taskService) {
		return args -> {
			taskService.save(new Task(1L,"create new Application ", LocalDate.now(), true));
			taskService.save(new Task(2L,"create required packages ", LocalDate.now().plus(2,ChronoUnit.DAYS), false));
			taskService.save(new Task(3L,"start writing code ", LocalDate.now().plus(3,ChronoUnit.DAYS), false));
		};
	}
}
