package com.springbootbasics.myspringbootbasicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springbootbasics"})
public class MyspringbootbasicappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootbasicappApplication.class, args);
	}

}
