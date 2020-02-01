package com.its.web.backend.thymeleaf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tuannx - itshare
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.its.web.*")
public class ITSWebThymeleafBackEndBootApp {
	public static void main(String[] args) {
		SpringApplication.run(ITSWebThymeleafBackEndBootApp.class, "");
	}
}
