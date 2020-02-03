package com.example.demo.controller.apiController;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.example.demo.vo.RecipientNo;
import com.example.demo.vo.SmsVo;
import com.google.gson.Gson;

//SMS테스트
public class Test {

	private final static String appKey = "vt5e1fgC9EQe0hnY";
	final static String uri = "https://api-sms.cloud.toast.com/sms/v2.0/appKeys/" + appKey + "/sender/sms";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmsVo SmsVo = new SmsVo();
		Gson gson = new Gson();
		SmsVo.setBody("Magic DB Connection is broken"); // 메세지 입력
		SmsVo.setSendNo("16006446"); // 발신자 번호 설정
		SmsVo.setUserId("admin"); // 미설정
		SmsVo.getRecipientList().add(new RecipientNo("01090631039")); // 수신자 추가 *수신번호가 겹치면 하나만 날아감.
		SmsVo.getRecipientList().add(new RecipientNo("01090631039")); // 수신자 추가

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);   //contentType 설정

		HttpEntity<String> entity = new HttpEntity<String>(gson.toJson(SmsVo), headers);

		RestTemplate restTemplate = new RestTemplate();

		String result = restTemplate.postForObject(uri, entity, String.class);

		System.out.println(result);
	}
}
