/**
 * 
 */
package com.smscountry.restapi.client.sms;

import org.junit.Test;

import com.smscountry.restapi.client.SmsCountry;
import com.smscountry.restapi.client.groups.GroupClient;
import com.smscountry.restapi.client.groups.GroupRequest;
import com.smscountry.restapi.client.groups.GroupResponse;
import com.smscountry.restapi.client.groups.Member;

/**
 * @author kuttan
 *
 */
public class TestGroupClientImpl {

	@Test
	public void testGetGroupDetails() {
		final GroupClient client = SmsCountry.getInstance().getGroupClient("7nZIXc5752aUeST8WATv",
				"UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N");
		
				
		GroupRequest request = new GroupRequest();
		request.setName("Gopi test");
		request.setTinyName("tiny test");
		request.setStartGroupCallOnEnter("919030103319");
		request.setEndGroupCallOnExit("919030103319");
		final GroupResponse response = client.updateGroup("19", request);
		
		System.out.println(response.getHttpStatusCode() + " " + response.getSuccess() + " " + response.getMessage());

	}

}
