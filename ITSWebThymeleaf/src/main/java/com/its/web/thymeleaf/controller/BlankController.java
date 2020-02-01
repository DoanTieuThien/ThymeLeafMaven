package com.its.web.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlankController {
	@RequestMapping("/blank")
	public String loginPage() {
		return "blank";
	}
}
