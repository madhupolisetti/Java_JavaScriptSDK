/**
 * 
 */
package com.smscountry.restapi.client;

import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 * @author Sajeesh
 *
 */
public abstract class GenericClient {

	private String authorization;
	private String apiKey;
	private Properties urlProperties;
	
	public GenericClient(String authorization, String apiKey, Properties urlProperties) {
		super();
		this.authorization = authorization;
		this.apiKey = apiKey;
		this.urlProperties = urlProperties;
	}

	/**
	 * @return the authorization
	 */
	protected String getAuthorization() {
		return authorization;
	}

	/**
	 * @param authorization the authorization to set
	 */
	protected void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	/**
	 * @return the apiKey
	 */
	protected String getApiKey() {
		return apiKey;
	}

	/**
	 * @param apiKey the apiKey to set
	 */
	protected void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * @return the urlProperties
	 */
	protected Properties getUrlProperties() {
		return urlProperties;
	}

	/**
	 * @param urlProperties the urlProperties to set
	 */
	protected void setUrlProperties(Properties urlProperties) {
		this.urlProperties = urlProperties;
	}
	
	protected Client getClient(){
		Client client = ClientBuilder.newClient();
		client.register(JacksonFeature.class);
		return client;
	}
}
