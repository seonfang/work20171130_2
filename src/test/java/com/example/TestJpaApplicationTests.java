package com.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJpaApplicationTests {

	@Autowired
	InsertService insertService;
	@Test
	public void contextLoads() {
		System.out.println("测试类");
		insertService.insertEmp(22, "He", 8000.11, 02);
		assertNotNull(insertService);
	}

}


