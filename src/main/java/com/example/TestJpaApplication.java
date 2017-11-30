package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJpaApplication {

	
	@Autowired
	InsertService insertService;
	public static void main(String[] args) {
		
		
		SpringApplication.run(TestJpaApplication.class, args);
		InsertService insert = new InsertService();
		insert.insertEmp(22, "HE", 8888.88, 02);
		System.out.println("运行结束");
	}
}
