package com.spring.test.controller;

import com.spring.test.dto.UserResponseDto;
import com.spring.test.model.User;
import com.spring.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/inject")
    public String injectUsers() {
        userService.add(new User("Bob", 23, "bob@com.ua"));
        userService.add(new User("Alise", 19, "alise@com.ua"));
        userService.add(new User("Jack", 27, "jack@mail.com"));
        return "3 users added";
    }

    @GetMapping("/get/{id}")
    public UserResponseDto getUser(@PathVariable Long id) {
        User user = userService.get(id);
        UserResponseDto userDto = new UserResponseDto();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

/*    @GetMapping
    public List<UserResponseDto> getAll() {
        List<User> users = userService.listUsers();
    }*/
}
