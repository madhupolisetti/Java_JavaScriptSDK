/**
 * 
 */
package com.smscountry.restapi.client;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;

import com.smscountry.restapi.client.calls.CallClient;
import com.smscountry.restapi.client.calls.CallClientImpl;
import com.smscountry.restapi.client.groupcalls.GroupCallClient;
import com.smscountry.restapi.client.groupcalls.GroupCallClientImpl;
import com.smscountry.restapi.client.groups.GroupClient;
import com.smscountry.restapi.client.groups.GroupClientImpl;
import com.smscountry.restapi.client.sms.SmsClient;
import com.smscountry.restapi.client.sms.SmsClientImpl;

/**
 * @author Sajeesh
 *
 */
public final class SmsCountry {
	
	private static SmsCountry instance = null;
	
	private Properties environmentProperties = new Properties();
	
	private SmsCountry(){
		super();
		try {
			environmentProperties.load(SmsCountry.class.getClassLoader().getResourceAsStream("prod.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private SmsCountry(final String environmentFile){
		super();
		try {
			environmentProperties.load(SmsCountry.class.getClassLoader().getResourceAsStream(environmentFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SmsCountry getInstance(){
		if(instance == null){
			instance = new SmsCountry();
		}
		return instance;
	}
	
	public static SmsCountry getInstance(final String environmentFile){
		if(instance == null){
			instance = new SmsCountry(environmentFile);
		}
		return instance;
	}
	
	public SmsClient getSmsClient(final String apiKey, final String apiToken) {
		return new SmsClientImpl(getAuthorizationHeader(apiKey, apiToken), apiKey, environmentProperties);
	}
	
	public GroupClient getGroupClient(final String apiKey, final String apiToken) {
		return new GroupClientImpl(getAuthorizationHeader(apiKey, apiToken), apiKey, environmentProperties);
	}
	
	public GroupCallClient getGroupCallClient(final String apiKey, final String apiToken) {
		return new GroupCallClientImpl(getAuthorizationHeader(apiKey, apiToken), apiKey, environmentProperties);
	}
	
	public CallClient getCallClient(final String apiKey, final String apiToken) {
		return new CallClientImpl(getAuthorizationHeader(apiKey, apiToken), apiKey, environmentProperties);
	}
	
	private String getAuthorizationHeader(final String apiKey, final String apiToken){
		final String authorization = apiKey + ":" + apiToken;
		byte [] encodedBytes = authorization.getBytes(StandardCharsets.UTF_8);
		
		return Base64.getEncoder().encodeToString(encodedBytes);
	}
	
	private void validateRequest(final String apiAuthKey, final String apiAuthToken){
		if (apiAuthKey == null || apiAuthKey == "" || apiAuthToken == null || apiAuthToken == "") {
			throw new IllegalArgumentException("Auth key or token shouldn't be empty or null");
		}
	}
}
