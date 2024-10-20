package com.myproject.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

	@GetMapping("/hello")
	public String getMethodName() {
		return "Hello Spring boot...";
	}

	@GetMapping("/test")
	public String getTest() {
		return "Test...";
	}

	@GetMapping("/pipeline")
	public String getTest() {
		return "Jenkins Pipeline...";
	}

}
