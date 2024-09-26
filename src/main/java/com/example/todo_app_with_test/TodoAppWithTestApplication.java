package com.example.todo_app_with_test;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class TodoAppWithTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppWithTestApplication.class, args);
		log.info("TEST COMMENT");
	}

}
