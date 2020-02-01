package com.its.web.thymeleaf.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

@Controller
public class ErrorControllerImpl implements ErrorController {

	@Override
	public String getErrorPath() {
		return "404";
	}

}
