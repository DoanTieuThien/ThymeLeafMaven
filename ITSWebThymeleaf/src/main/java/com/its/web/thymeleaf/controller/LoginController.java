package com.its.web.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String loadLoginPage() {
		return "login";
	}
}
