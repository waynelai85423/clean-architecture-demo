package com.leo.demo.member.adapter.out.repositories.jpa.repository;

import com.leo.demo.member.usecase.port.out.UserGetRepository;

public class UserGetAdapter implements UserGetRepository {
    @Override
    public String selectAll() {
        return "Adapter: select all users";
    }
}
