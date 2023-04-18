package com.tareas.model.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tareas.model.Tarea;

public interface TareaRepository  extends MongoRepository<Tarea, String>{

}
