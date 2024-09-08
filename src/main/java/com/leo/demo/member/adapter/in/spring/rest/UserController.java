package com.leo.demo.member.adapter.in.spring.rest;

import com.leo.demo.member.entities.po.User;
import com.leo.demo.member.usecase.port.in.UserInputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserInputPort userInputPort;

//    @Autowired
//    private PostgreSQLProperties postgreSQLProperties;

    @GetMapping("user")
    public List<User> getUsers() {
        List<User> users = userInputPort.getUsers();
        log.info("UseCase result: {}", users);
//        log.info("PostgreSQL properties result: {}", postgreSQLProperties);
        return users;
    }

    @PostMapping("user")
    public String create(@RequestBody User[] user) {
        log.info("Request body: {}", user);
        return "success";
    }
}
