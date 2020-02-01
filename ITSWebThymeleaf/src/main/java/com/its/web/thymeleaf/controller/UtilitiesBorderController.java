package com.its.web.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilitiesBorderController {
	@RequestMapping("/utilities-border")
	public String loginPage() {
		return "utilities-border";
	}
}
