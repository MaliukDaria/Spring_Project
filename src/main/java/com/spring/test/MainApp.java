package com.spring.test;

import com.spring.test.config.AppConfig;
import com.spring.test.model.User;
import com.spring.test.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
      /*  AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User bob = new User("Bob", 23, "bob@com.ua");
        User alise = new User("Alise", 19, "alise@com.ua");
        userService.add(bob);
        userService.add(alise);
        userService.listUsers().forEach(System.out::println);*/
    }
}
