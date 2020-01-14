package com.example.demo.controller.viewController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.TestService;

@Controller
public class ViewController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/")
	public String goToLogin() {
		return "login";
	}
	
	@RequestMapping("/query")
	public String goToQuery() throws Exception{
		testService.getSysdate();
		return "query";
	}
	
	@RequestMapping("/login")
//	public String getLogin(@RequestParam(value="U_ID", required=false) String U_ID) throws Exception{
	public String getLogin(@RequestParam Map<String,String> param) throws Exception{
//System.out.println("U_ID = " + param.get("USERNAME"));
//		accountService.getUserInfo(param.get("USERNAME"));
//		accountService.getUserAuthority(param.get("USERNAME"));
		
		return "login";
	}
}
