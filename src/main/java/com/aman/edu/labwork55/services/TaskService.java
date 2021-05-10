package com.aman.edu.labwork55.services;

import com.aman.edu.labwork55.dto.TaskDto;
import com.aman.edu.labwork55.entities.Status;
import com.aman.edu.labwork55.entities.Task;
import com.aman.edu.labwork55.entities.User;
import com.aman.edu.labwork55.repositories.TaskRepositories;
import com.aman.edu.labwork55.repositories.UserRepositories;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepositories taskRepositories;
    private final UserRepositories userRepositories;

    public Page<TaskDto> getAllTaskById(User user, Pageable pageable){
        return taskRepositories.findByUser(user,pageable);
    }

    public Task create(Task task){
        return this.taskRepositories.save(task);
    }

    public Optional<Task> changeStatus(String taskId, Status status ){
       Optional<Task> task = taskRepositories.findById(taskId);
       task.ifPresent(value -> value.setStatus(status));
       return task;
    }


}
