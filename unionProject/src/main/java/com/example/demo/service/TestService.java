package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.vo.TestVo;

@Service
public class TestService {
	@Autowired
	TestMapper testMapper;
	
	public void getSysdate() throws Exception{
		List<TestVo> list = testMapper.getSysdate();
		for(TestVo i:list) {
			System.out.println(i.toString());
		}
	}
}
