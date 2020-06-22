package com.example.demo.vo;

import java.util.ArrayList;

import lombok.Data;

@Data
public class SmsVo {
	private String body;
	private String sendNo;
	private String userId;
	private ArrayList<RecipientNo> recipientList = new ArrayList<RecipientNo>();
	
}
