package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class })
public class ExamPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
		
		System.out.println("Application Running");
	}

}