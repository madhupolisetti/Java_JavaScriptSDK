/**
 * 
 */
package com.smscountry.restapi.client.sms;


import org.junit.Test;

import com.smscountry.restapi.client.SmsCountry;
import com.smscountry.restapi.client.groupcalls.GroupCallClient;
import com.smscountry.restapi.client.groupcalls.GroupCallResponse;

/**
 * @author kuttan
 *
 */
public class TestGroupCallClientImpl {

	/**
	 * Test method for {@link com.smscountry.restapi.client.groupcalls.GroupCallClientImpl#getGroupCallDetails(java.lang.String)}.
	 */
	@Test
	public void testGetGroupCallDetails() {
		final GroupCallClient client = SmsCountry.getInstance().getGroupCallClient("7nZIXc5752aUeST8WATv",
				"UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		final GroupCallResponse response = client.getGroupCallDetails("1234");
		
		System.out.println(response.getHttpStatusCode() + " " + response.getSuccess() + " " + response.getMessage());
	}

}
