package com.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void addTest()
	{
		assertEquals(5, 2 + 2);
	}
}
