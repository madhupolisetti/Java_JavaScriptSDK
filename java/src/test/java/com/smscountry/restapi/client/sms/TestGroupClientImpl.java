/**
 * 
 */
package com.smscountry.restapi.client.sms;

import org.junit.Test;

import com.smscountry.restapi.client.SmsCountry;
import com.smscountry.restapi.client.groups.GroupClient;
import com.smscountry.restapi.client.groups.GroupResponse;

/**
 * @author kuttan
 *
 */
public class TestGroupClientImpl {

	@Test
	public void testGetGroupDetails() {
		final GroupClient client = SmsCountry.getInstance().getGroupClient("7nZIXc5752aUeST8WATv",
				"UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
		final GroupResponse response = client.getGroupDetails("1234");
		
		System.out.println(response.getHttpStatusCode() + " " + response.getSuccess() + " " + response.getMessage());

	}

}
