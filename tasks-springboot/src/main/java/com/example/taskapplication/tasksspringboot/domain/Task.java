package com.example.taskapplication.tasksspringboot.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Task {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@JsonFormat(pattern="MM/dd/uuuu")
	private LocalDate dueDate;
	private Boolean completed;

	public Task() {
		super();
	}
	
	public Task(long id, String name, LocalDate dueDate, Boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.dueDate = dueDate;
		this.completed = completed;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

}
