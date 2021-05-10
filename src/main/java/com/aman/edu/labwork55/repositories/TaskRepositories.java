package com.aman.edu.labwork55.repositories;

import com.aman.edu.labwork55.dto.TaskDto;
import com.aman.edu.labwork55.entities.Task;
import com.aman.edu.labwork55.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface TaskRepositories extends MongoRepository<Task,String> {
    Page<TaskDto> findByUser(User user, Pageable pageable);
    Optional<Task> findById(String id);
}
