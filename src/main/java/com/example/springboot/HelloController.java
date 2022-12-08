package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@Value("${config:no configuration}")
    private String config;

    private static int count = 1;

	@GetMapping("/")
	public String index() {
		System.out.println("Ping no: "+count++);
		return String.format("Greetings from Spring Boot in OpenShift using %s!", config);
	}
}
