package com.hak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YvesController {
	@GetMapping("/")
	public String getMessage() {
		return "welcome to spgBootGitJenkinsIntegration";
	}
	@GetMapping
	public String getAWS() {
		return "welcome to AWS";
	}

}
