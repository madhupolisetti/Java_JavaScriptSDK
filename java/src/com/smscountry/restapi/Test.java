package com.smscountry.restapi;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Test {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		String apiKeyToken = "7nZIXc5752aUeST8WATv:UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N";
		byte [] encodedBytes = apiKeyToken.getBytes(StandardCharsets.UTF_8);
		final String encoded = Base64.getEncoder().encodeToString(encodedBytes);
		Response response = client.target("https://restapi.smscountry.com/v0.1/Accounts/7nZIXc5752aUeST8WATv/SMSes/4236749c-0d5c-4b1e-9598-3260e688d616/")
		  .request(MediaType.TEXT_PLAIN_TYPE)
		  .header("Authorization", "Basic " + encoded)
		  .get();

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));

	}

}
