package com.aman.edu.labwork55.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Builder
@Data
public class UserDto {

    private String name;
    private List<TaskDto> tasks;
}
