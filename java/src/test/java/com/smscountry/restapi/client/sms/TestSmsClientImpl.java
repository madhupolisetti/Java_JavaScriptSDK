package com.smscountry.restapi.client.sms;

import org.junit.Test;

import com.smscountry.restapi.client.SmsCountry;

public class TestSmsClientImpl {

	@Test
	public void testSendSMS() {
		SmsClient client = SmsCountry.getInstance().getSmsClient("7nZIXc5752aUeST8WATv", "UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		SmsRequest smsRequest = new SmsRequest();
		smsRequest.setText("A sample text");
		smsRequest.setNumber("919531222233");
		smsRequest.setSenderId("");
		smsRequest.setDrNotifyUrl("https://www.domainname.com/notifyurl");
		smsRequest.setDrNotifyHttpMethod("Post");
		SmsResponse  response = client.sendSMS(smsRequest);
		System.out.println(response.getSuccess() + " " + response.getMessage());
	}
	
	@Test
	public void testGetSmsDetails(){
		SmsClient client = SmsCountry.getInstance().getSmsClient("7nZIXc5752aUeST8WATv", "UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		SmsResponse response = client.getSMSDetails("4236749c-0d5c-4b1e-9598-3260e688d616");
		System.out.println(response.getSuccess() + " " + response.getMessage());

	}
	
	@Test
	public void testGetSmsCollection(){
		SmsClient client = SmsCountry.getInstance().getSmsClient("7nZIXc5752aUeST8WATv", "UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		SmsResponse response = client.getSMSCollection("", "", "SmsCountry");
		System.out.println(response.getSuccess() + " " + response.getMessage());

	}
	
	@Test
	public void testSendBulkSMS() {
		SmsClient client = SmsCountry.getInstance().getSmsClient("7nZIXc5752aUeST8WATv", "UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		SmsRequest smsRequest = new SmsRequest();
		smsRequest.setText("A sample text");
		smsRequest.setNumbers(new String[]{"919531222233","919531222233"});
		smsRequest.setSenderId("");
		smsRequest.setDrNotifyUrl("https://www.domainname.com/notifyurl");
		smsRequest.setDrNotifyHttpMethod("Post");
		SmsResponse  response = client.sendBulkSMS(smsRequest);
		System.out.println(response.getSuccess() + " " + response.getMessage());
	}

}
