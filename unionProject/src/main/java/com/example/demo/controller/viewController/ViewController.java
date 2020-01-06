package com.example.demo.controller.viewController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.TestService;

@Controller
public class ViewController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/index")
	public String goToIndex() {
		return "index";
	}
	
	@RequestMapping("/query")
	public String goToQuery() throws Exception{
		testService.getSysdate();
		return "query";
	}
	
	@RequestMapping("/login")
	public String goToLogin() {
		return "login";
	}

}
