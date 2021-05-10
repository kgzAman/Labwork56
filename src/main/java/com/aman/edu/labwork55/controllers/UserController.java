package com.aman.edu.labwork55.controllers;

import com.aman.edu.labwork55.dto.LoginUserIdDto;
import com.aman.edu.labwork55.dto.UserDto;
import com.aman.edu.labwork55.entities.User;
import com.aman.edu.labwork55.services.UserService;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
@Data
public class UserController {

    private UserService userService;

    @PostMapping("/registration")
    public UserDto login(@RequestBody LoginUserIdDto userDto){
        User user = User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
        this.userService.save(user);


        final User logined = this.userService.save(user);
        return UserDto.builder()
                .name(logined.getId())
                .build();
    }
}
