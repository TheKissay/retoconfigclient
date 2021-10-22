package com.example.retoconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VariableController {

	@Value("${variable1.valor}")
	private String miVariable;
	
	@GetMapping(path="variable")
	public String miVariable() {
		return this.miVariable;
	}

	
	
}
