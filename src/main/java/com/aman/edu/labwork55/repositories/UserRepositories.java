package com.aman.edu.labwork55.repositories;

import com.aman.edu.labwork55.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepositories extends MongoRepository<User,String> {
    Optional<User>findById(String id);
    Optional<User>findByName(String id);
    Boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
    Optional<User> getByEmail(String email);
}
