package com.its.web.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ButtonsController {
	@RequestMapping("/buttons")
	public String loginPage() {
		return "buttons";
	}
}
