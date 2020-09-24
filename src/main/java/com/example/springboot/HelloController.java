package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		return "Greetings from Spring Boot!";
	}
	public String ndex() {
		return "Greetings from Spring Boot!";
	}
	

}