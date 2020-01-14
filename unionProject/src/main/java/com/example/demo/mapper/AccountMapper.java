package com.example.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.vo.Account;

@Repository
public interface AccountMapper {

	public Account getUserInfo(String USERNAME) throws Exception;

	public List<String> getUserAuthority(String USERNAME) throws Exception;

}
