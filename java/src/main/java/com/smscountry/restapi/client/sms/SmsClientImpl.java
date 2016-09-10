package com.smscountry.restapi.client.sms;

import java.text.MessageFormat;
import java.util.Properties;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.smscountry.restapi.client.GenericClient;

/**
 * 
 * @author Sajeesh
 *
 */
public class SmsClientImpl extends GenericClient implements SmsClient {

	public SmsClientImpl(String authorization, String apiKey, Properties urlProperties) {
		super(authorization, apiKey, urlProperties);
	}

	@Override
	public SmsResponse sendSMS(final SmsRequest request) {
		final String url = getUrlProperties().getProperty("send_sms_url");

		Entity<SmsRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey()))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final SmsResponse result = response.readEntity(SmsResponse.class);
		result.setHttpCallCode(response.getStatus());
		return result;
	}

	@Override
	public SmsResponse getSMSDetails(final String messageUUID) {
		final String url = getUrlProperties().getProperty("get_sms_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), messageUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final SmsResponse result = response.readEntity(SmsResponse.class);
		result.setHttpCallCode(response.getStatus());
		return result;
	}

	@Override
	public SmsResponse getSMSCollection(final String fromDate, final String toDate, final String senderId,
			final String offset, final String limit) {
		final String url = getUrlProperties().getProperty("get_sms_collections_url");

		Response response = getClient()
				.target(MessageFormat.format(url, getApiKey(), fromDate, toDate, senderId, offset, limit))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final SmsResponse result = response.readEntity(SmsResponse.class);
		result.setHttpCallCode(response.getStatus());
		return result;
	}

	@Override
	public SmsResponse sendBulkSMS(final SmsRequest request) {
		final String url = getUrlProperties().getProperty("send_bulk_sms_url");

		Entity<SmsRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey()))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final SmsResponse result = response.readEntity(SmsResponse.class);
		result.setHttpCallCode(response.getStatus());
		return result;
	}

}
