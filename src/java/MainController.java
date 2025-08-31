package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!";
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
