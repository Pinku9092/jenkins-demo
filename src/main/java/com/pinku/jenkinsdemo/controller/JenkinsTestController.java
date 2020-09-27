package com.pinku.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

	@GetMapping("/show")
	public String showMessage() {
		return "Coming from through git show messsage";
	}
}
