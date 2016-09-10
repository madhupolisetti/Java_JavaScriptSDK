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
		
		/*CallRequest request = new CallRequest();
		request.setNumber("918897066686");
		request.setSenderId("");
		request.setRingUrl("http://domainname/ringurl");
		request.setAnswerUrl("http://domainname/answerurl");
		request.setHangupUrl("http://domainname/hangupurl");
		request.setHttpMethod("POST");
		request.setXml("<Request><play>xxx</play></Request>");
		final CallResponse response = client.createNewCall(request);*/
		
		//final CallResponse response = client.getCallDetails("990685f2-3b94-40a3-9016-decf7680d049");
		//final CallResponse response = client.getCallList("", "", "SmsCountry", "", "");
		final CallResponse response = client.disconnectCall("79cf387f-67e1-4045-8978-c6ee7477861b");
		System.out.println(response.getSuccess() + response.getMessage());
		
		
		
		
	}

}
