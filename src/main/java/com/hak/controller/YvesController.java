package com.hak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YvesController {
	@GetMapping("/api")
	public String getMessage() {
		return "welcome to spgBootAWSCodeDeploy";
	}
	@GetMapping("/aws")
	public String getAWS() {
		return "welcome to AWS";
	}

}
