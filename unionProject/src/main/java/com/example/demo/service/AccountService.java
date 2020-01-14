package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AccountMapper;
import com.example.demo.vo.Account;

@Service
public class AccountService {
	@Autowired
	AccountMapper accountMapper;
	
	public Account getUserInfo(String USERNAME) throws Exception{
		Account info = accountMapper.getUserInfo(USERNAME);
System.out.println("info = " + info);
		return info;
	}
	
	public void getUserAuthority(String USERNAME) throws Exception{
		List<String> list = accountMapper.getUserAuthority(USERNAME);
		for(String auth:list) {
System.out.println(auth);
		}
	}
}