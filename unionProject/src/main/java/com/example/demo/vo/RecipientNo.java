package com.example.demo.vo;

import lombok.Data;

@Data
public class RecipientNo {
	private String recipientNo;

	public RecipientNo(String recipientNo) {
		super();
		this.recipientNo = recipientNo;
	}

}
