package com.example.demo;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.demo.controller")
public class DemoApplicationTests{

	public static void main(String[] args)throws Exception {
		SpringApplication.run(DemoApplicationTests.class, args);

	}

}
