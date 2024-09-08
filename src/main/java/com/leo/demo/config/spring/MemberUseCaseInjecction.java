package com.leo.demo.config.spring;

import com.leo.demo.member.usecase.member.UserUseCase;
import com.leo.demo.member.usecase.port.in.UserInputPort;
import com.leo.demo.member.usecase.port.out.UserGetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class MemberUseCaseInjecction {
    @Bean
    public UserInputPort getUserInputPort(@Autowired UserGetRepository getRepository, @Qualifier("postgresJdbcTemplate") NamedParameterJdbcTemplate jdbcTemplate) {
        return new UserUseCase(getRepository,jdbcTemplate);
    }
}
