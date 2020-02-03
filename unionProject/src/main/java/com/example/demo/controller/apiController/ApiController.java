package com.example.demo.controller.apiController;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
	
	@Resource(name="redisTemplate") private ValueOperations<String, String> valueOperations;
	@Autowired	private RedisTemplate redisTemplate;

	// {itemName}
	// @PathVariable String itemName
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public Map<String, Object> findByItemName(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("ApiController====================================");
		Map<String, Object> result = new HashMap<String, Object>();
		valueOperations.set("12", "33");
		result.put("test", "aaaa"); 
		System.out.println(valueOperations.get("12"));
		return result;	
	}
}
