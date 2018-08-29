package com.example.taskapplication.tasksspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskapplication.tasksspringboot.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
