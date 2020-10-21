package com.spring.test.controller;

import com.spring.test.dto.UserResponseDto;
import com.spring.test.model.User;
import com.spring.test.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/inject")
    public String injectUsers() {
        userService.add(new User("Bob", 23, "bob@com.ua", "1111"));
        userService.add(new User("Alise", 19, "alise@com.ua", "1234"));
        userService.add(new User("Jack", 27, "jack@mail.com", "jack"));
        userService.add(new User("Lisa", 23, "lisa@mail.com", "lisa123"));
        return "4 users added";
    }

    @GetMapping("/{userId}")
    public UserResponseDto getUser(@PathVariable("userId") Long id) {
        return modelMapper.map(userService.get(id), UserResponseDto.class);
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(u -> modelMapper.map(u, UserResponseDto.class))
                .collect(Collectors.toList());
    }
}
