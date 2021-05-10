//package com.aman.edu.labwork55.controllers;
//
//import com.aman.edu.labwork55.dto.TaskDto;
//import com.aman.edu.labwork55.entities.Status;
//import com.aman.edu.labwork55.entities.Task;
//import com.aman.edu.labwork55.entities.User;
//import com.aman.edu.labwork55.repositories.TaskRepositories;
//import com.aman.edu.labwork55.services.TaskService;
//import org.modelmapper.ModelMapper;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping(path = "/api/task")
//public class TaskController {
//    private final TaskService taskService;
//    private final TaskRepositories taskRepositories;
//    private static  final ModelMapper modelMapper = new ModelMapper();
//
//    public TaskController(TaskService taskService, TaskRepositories taskRepositories) {
//        this.taskService = taskService;
//        this.taskRepositories = taskRepositories;
//    }
//
//    @GetMapping("/MyTasks")
//    public Page<TaskDto> getAllTaskById(Authentication authentication, Pageable pageable){
//        User user = (User) authentication.getPrincipal();
//        return taskService.getAllTaskById(user,pageable);
//    }
//
//    @PostMapping("/makeTask")
//    public String post(@RequestBody TaskDto dto, Authentication authentication){
//        User user = (User)authentication.getPrincipal();
//        Task task = Task.builder()
//                .description(dto.getDescription())
//                .header(dto.getHeader())
//                .localDateTime(dto.getLocalDateTime())
//                .user(user)
//                .status(Status.NEW)
//                .build();
//        return this.taskService.create(task).getId();
//    }
//
//    @PostMapping("/makeChange")
//    public Optional<Task> change(Authentication authentication, String taskId,@RequestBody Status status){
//        User user = (User)authentication.getPrincipal();
//        return this.taskService.changeStatus(taskId,status);
//    }
//
//    @GetMapping("/MyTasks/details")
//    public Page<TaskDto> viewDetails(Authentication authentication,Pageable pageable){
//        User user = (User)authentication.getPrincipal();
//         return taskRepositories.findByUser(user,pageable)
//                 .map(task->modelMapper.map(task,TaskDto.class));
//    }
//
//}
