package com.leo.demo.config.spring;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @ConfigurationProperties(prefix = "postgres.datasource")
    @Bean(name = "postgresDataSource")
    public DataSource postgresDataSource() {
        return new HikariDataSource();
    }

    @ConfigurationProperties(prefix = "postgres.datasource1")
    @Bean(name = "postgresDataSource1")
    public DataSource postgresDataSource1() {
        return new HikariDataSource();
    }

}
