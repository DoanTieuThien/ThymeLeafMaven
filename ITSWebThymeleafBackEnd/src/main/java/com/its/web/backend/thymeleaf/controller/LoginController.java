package com.its.web.backend.thymeleaf.controller;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.its.web.backend.thymeleaf.model.ResponseModel;
import com.its.web.backend.thymeleaf.model.input.LoginInputModel;
import com.its.web.backend.thymeleaf.model.output.LoginOutputModel;

@RestController
@CrossOrigin("*")
public class LoginController {

	@PostMapping("/login")
	public @ResponseBody ResponseModel login(@RequestBody LoginInputModel loginInput) {
		ResponseModel res = new ResponseModel();

		try {
			String userName = Optional.ofNullable(loginInput.getUserName()).orElse("").trim().toUpperCase();
			String password = Optional.ofNullable(loginInput.getPassword()).orElse("").trim().toUpperCase();

			if (!userName.equals("ITS_SAMPLE") && !password.equals("ITS_SAMPLE")) {
				res.setCode("API-00001");
				res.setMessage("User name or password incorrect, please try again!");
				return res;
			}
			LoginOutputModel loginOutputModel = new LoginOutputModel();

			loginOutputModel.setUserName(userName);
			loginOutputModel.setExpiredTime(1800);
			loginOutputModel.setStartDateTime(new Date());
			loginOutputModel.setSessionId(UUID.randomUUID().toString());
			
			res.setCode("API-00000");
			res.setMessage("SUCCESSED");
			res.setPayload(loginOutputModel);
		} catch (Exception exp) {
			exp.printStackTrace();
			res.setCode("API-99999");
			res.setMessage(exp.getMessage());
		}
		return res;
	}
}
