package com.example.build.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildController {

	@GetMapping(value = "/getData")
	public String getData() {
		return "Hello...!";
	}
}
