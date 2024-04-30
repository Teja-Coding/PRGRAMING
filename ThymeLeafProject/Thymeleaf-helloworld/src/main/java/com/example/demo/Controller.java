package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/world")
	public String hello(Model model) {
		
		model.addAttribute("mess", "helloworld");
		return "hello";
		
	}
	@GetMapping("/boot")
	public String boot() {
		return "bootstrap";
		
	}
}
