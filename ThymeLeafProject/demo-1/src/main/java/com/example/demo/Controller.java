package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {
	@GetMapping("/mani")
	public String hello(Model model) {
		
		model.addAttribute("message", "HELLOWORLD");
		return "hello";
		
	}
}
