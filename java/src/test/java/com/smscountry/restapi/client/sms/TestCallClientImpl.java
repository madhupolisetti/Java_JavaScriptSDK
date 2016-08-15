package com.smscountry.restapi.client.sms;


import org.junit.Test;

import com.smscountry.restapi.client.SmsCountry;
import com.smscountry.restapi.client.calls.CallClient;
import com.smscountry.restapi.client.calls.CallResponse;


public class TestCallClientImpl {

	@Test
	public void testGetCallDetails() {
		final CallClient client = SmsCountry.getInstance().getCallClient("7nZIXc5752aUeST8WATv",
				"UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		final CallResponse response = client.getCallDetails("1234");
		
		System.out.println(response.getHttpStatusCode() + " " + response.getSuccess() + " " + response.getMessage());
	}

}
