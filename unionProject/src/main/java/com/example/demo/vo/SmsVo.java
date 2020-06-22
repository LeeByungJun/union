package com.example.demo.vo;

import java.util.ArrayList;

import lombok.Data;

@Data
public class SmsVo {
	private String body;
	private String sendNo;
	private String userId;
	private ArrayList<RecipientNo> recipientList = new ArrayList<RecipientNo>();
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSendNo() {
		return sendNo;
	}
	public void setSendNo(String sendNo) {
		this.sendNo = sendNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ArrayList<RecipientNo> getRecipientList() {
		return recipientList;
	}
	public void setRecipientList(ArrayList<RecipientNo> recipientList) {
		this.recipientList = recipientList;
	}
	
}
