package com.smscountry.restapi.client.calls;

import java.text.MessageFormat;
import java.util.Properties;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.HttpUrlConnectorProvider;

import com.smscountry.restapi.client.GenericClient;


/**
 * 
 * @author Sajeesh
 *
 */
public class CallClientImpl extends GenericClient implements CallClient {

	public CallClientImpl(String authorization, String apiKey, Properties urlProperties) {
		super(authorization, apiKey, urlProperties);
	}

	@Override
	public CallResponse createNewCall(final CallRequest request) {
		final String url = getUrlProperties().getProperty("create_new_call_url");

		Entity<CallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey()))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public CallResponse createBulkCall(final CallRequest request) {
		final String url = getUrlProperties().getProperty("create_bulk_call_url");

		Entity<CallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey()))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public CallResponse getCallDetails(final String callUUID) {
		final String url = getUrlProperties().getProperty("get_call_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), callUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public CallResponse getCallList(String fromDate, String toDate, String senderId, final String offset,
			final String limit) {
		final String url = getUrlProperties().getProperty("get_call_list_url");

		Response response = getClient()
				.target(MessageFormat.format(url, getApiKey(), fromDate, toDate, senderId, offset, limit))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	public CallResponse playSound(final CallRequest request, final String callUUID) {
		final String url = getUrlProperties().getProperty("play_sound_into_call_url");

		Entity<CallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey(), callUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	public CallResponse stopSound(final String callUUID) {
		final String url = getUrlProperties().getProperty("stop_play_into_call_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), callUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.delete();
		final CallResponse result = new CallResponse();
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	public CallResponse startRecording(final CallRequest request, final String callUUID) {
		final String url = getUrlProperties().getProperty("start_recording_into_call_url");

		Entity<CallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey(), callUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	public CallResponse stopRecording(final String callUUID, final String recordingUUID) {
		final String url = getUrlProperties().getProperty("stop_recording_into_call_url");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), callUUID, recordingUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");

		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public CallResponse getRecordingDetails(final String callUUID, final String recordingUUID) {
		final String url = getUrlProperties().getProperty("get_recording_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), callUUID, recordingUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public CallResponse getAllRecordingDetails(final String callUUID) {
		final String url = getUrlProperties().getProperty("get_all_recording_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), callUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	public CallResponse disconnectCall(final String callUUID) {
		final String url = getUrlProperties().getProperty("disconnect_call_url");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), callUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");

		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	public CallResponse disconnectMultipleCalls(final CallRequest request) {
		final String url = getUrlProperties().getProperty("disconnect_all_calls_url");

		Entity<CallRequest> payload = Entity.json(request);
		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey()))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH", payload);

		final CallResponse result = response.readEntity(CallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}
}
