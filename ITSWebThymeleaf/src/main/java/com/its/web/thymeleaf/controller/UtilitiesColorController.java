package com.its.web.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilitiesColorController {
	@RequestMapping("/utilities-color")
	public String loginPage() {
		return "utilities-color";
	}
}
