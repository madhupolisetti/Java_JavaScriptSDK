package com.smscountry.restapi.client.sms;


import org.glassfish.jersey.client.ClientResponse;
import org.junit.Test;

import com.smscountry.restapi.client.SmsCountry;
import com.smscountry.restapi.client.calls.CallClient;
import com.smscountry.restapi.client.calls.CallRequest;
import com.smscountry.restapi.client.calls.CallResponse;


public class TestCallClientImpl {

	@Test
	public void testGetCallDetails() {
		final CallClient client = SmsCountry.getInstance().getCallClient("7nZIXc5752aUeST8WATv",
				"UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		CallRequest request = new CallRequest();
		request.setFileFormat("MP3");
		request.setTimeLimit(60);
		final CallResponse response = client.getRecordingDetails( "79cf387f-67e1-4045-8978-c6ee7477861b", "1234");
		System.out.println(response.getSuccess() + response.getMessage());
		
	}

}
