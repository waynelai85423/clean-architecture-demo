package com.leo.demo.member.usecase.port.in;

import com.leo.demo.member.entities.po.User;

import java.util.List;

public interface UserInputPort {
    List<User> getUsers();
}
