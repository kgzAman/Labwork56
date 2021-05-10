package com.aman.edu.labwork55.dto;

import com.aman.edu.labwork55.entities.Status;
import com.aman.edu.labwork55.entities.Task;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Data
@Builder
public class TaskDto {
    public static TaskDto from(Task task) {

        return builder()
                .id(task.getId())
                .description(task.getDescription())
                .header(task.getHeader())
                .build();
    }

    @Id
    private String id;

    private String header;
    private String description;
    private LocalDateTime localDateTime;
    private Status status;
}
