package com.example.demo.controller.apiController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
	

	//{itemName}
	//@PathVariable String itemName
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public Map<String, Object> findByItemName(HttpServletRequest request, HttpServletResponse response
			) {
		
System.out.println("ApiController====================================");
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("test", "aaaa");
		return result;
	}

}
