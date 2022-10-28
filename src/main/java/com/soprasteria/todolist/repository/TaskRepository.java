package com.soprasteria.todolist.repository;



import org.springframework.data.repository.CrudRepository;

import com.soprasteria.todolist.model.Task;



public interface TaskRepository extends CrudRepository<Task, Integer>{
	
}



