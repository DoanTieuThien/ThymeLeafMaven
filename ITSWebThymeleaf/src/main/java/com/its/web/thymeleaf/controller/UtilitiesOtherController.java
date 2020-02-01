package com.its.web.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilitiesOtherController {
	@RequestMapping("/utilities-other")
	public String loginPage() {
		return "utilities-other";
	}
}
