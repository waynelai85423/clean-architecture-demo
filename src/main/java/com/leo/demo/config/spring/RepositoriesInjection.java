package com.leo.demo.config.spring;

import com.leo.demo.member.adapter.out.repositories.jpa.repository.UserGetAdapter;
import com.leo.demo.member.usecase.port.out.UserGetRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class RepositoriesInjection {
    @Bean
    public UserGetRepository getGetUserRepository() {
        return new UserGetAdapter();
    }


    @Bean("postgresJdbcTemplate")
    public NamedParameterJdbcTemplate jdbcTemplate(@Qualifier("postgresDataSource") DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
