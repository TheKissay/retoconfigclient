package com.example.retoconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class VariableController {

	@Value("${variable1.valor}")
	private String miVariable;
	
	@Value("${variable2.valor}")
	private String miVariable2;
	
	@GetMapping(path="variable")
	public String miVariable() {
		return this.miVariable + " " + miVariable2;
	}

	
	
}
