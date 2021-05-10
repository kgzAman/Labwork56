package com.aman.edu.labwork55.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class LoginUserIdDto {
    private String name;
    private String email;
    private String password;

    private LocalDateTime localDateTime;

}
