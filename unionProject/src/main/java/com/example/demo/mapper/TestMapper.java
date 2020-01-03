package com.example.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.vo.TestVo;

@Repository
public interface TestMapper {
	public List<TestVo> getSysdate() throws Exception;
}
