package com.leo.demo.member.usecase.member;

import com.leo.demo.member.entities.po.User;
import com.leo.demo.member.usecase.port.in.UserInputPort;
import com.leo.demo.member.usecase.port.out.UserGetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

@Slf4j
public class UserUseCase implements UserInputPort {

    private final UserGetRepository userGetRepository;

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public UserUseCase(UserGetRepository userGetRepository, NamedParameterJdbcTemplate jdbcTemplate) {
        this.userGetRepository = userGetRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }
}
