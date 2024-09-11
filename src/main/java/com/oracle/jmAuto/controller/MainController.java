package com.oracle.jmAuto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {
	

	@GetMapping(value = "/")
	public String main() {
		log.info("MainController main() is started");	
		System.out.println("controller 정민 고침");
		System.out.println("controller 지원 고침");
		System.out.println("controller 혁 고침");
		return "main";
	}
	


	
}
