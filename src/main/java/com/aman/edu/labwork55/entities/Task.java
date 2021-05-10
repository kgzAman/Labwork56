package com.aman.edu.labwork55.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Document(collection = "task")
@Builder
public class Task {

    @Id
    private String id;
    private String header;
    private String description;
    private LocalDateTime localDateTime;

    @DBRef
    private User user;

    @Indexed
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }
}
