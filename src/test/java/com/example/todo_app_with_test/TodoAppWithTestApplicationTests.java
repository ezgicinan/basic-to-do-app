package com.example.todo_app_with_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoAppWithTestApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertDoesNotThrow(()->{});
	}

}
