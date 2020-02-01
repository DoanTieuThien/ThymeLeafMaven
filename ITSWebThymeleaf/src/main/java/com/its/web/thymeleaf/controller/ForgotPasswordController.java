package com.its.web.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForgotPasswordController {
	@RequestMapping("/forgot-password")
	public String loginPage() {
		return "forgot-password";
	}
}
