package com.ynz.demo.jooqdao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JooqDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooqDaoApplication.class, args);
	}

}
