package com.ynz.demo.jooqdao.config;

import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class InitJoopConfig {

    private final DataSource dataSource;

    public InitJoopConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
