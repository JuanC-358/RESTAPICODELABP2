package com.example.demoP2.service;

import java.util.List;

import com.example.demoP2.data.Task;

public interface TaskService {
    Task create(Task task );
    Task findById( String id );
    List<Task> getAll();
    boolean deleteById( String id ) throws Exception;
    Task update( Task task, String id );
}
