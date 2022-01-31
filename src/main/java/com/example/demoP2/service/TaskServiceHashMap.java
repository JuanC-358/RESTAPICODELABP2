package com.example.demoP2.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.example.demoP2.data.Task;

@Service
public class TaskServiceHashMap implements TaskService {
    HashMap<String , Task> tasks = new HashMap<>();
    @Override
    public Task create(Task task) {
        tasks.put(task.getId() , task);
        return task;
    }

    @Override
    public Task findById(String id) {
        return tasks.containsKey(id) ? tasks.get(id) : null ;
    }

    @Override
    public List<Task> getAll() {

        return new ArrayList<Task>(tasks.values());
    }

    @Override
    public boolean deleteById(String id) throws Exception {
        if (tasks.containsKey(id)) {
            tasks.remove(id) ;
            return true;
        }
        else return false;
    }

    @Override
    public Task update(Task task, String id) {
        if(tasks.containsKey(id)) tasks.put(id,task);
        return task;
    }
}
