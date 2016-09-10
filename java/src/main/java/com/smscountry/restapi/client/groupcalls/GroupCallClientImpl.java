/**
 * 
 */
package com.smscountry.restapi.client.groupcalls;

import java.text.MessageFormat;
import java.util.Properties;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.HttpUrlConnectorProvider;

import com.smscountry.restapi.client.GenericClient;


/**
 * @author Sajeesh
 *
 */
public class GroupCallClientImpl extends GenericClient implements GroupCallClient {

	public GroupCallClientImpl(String authorization, String apiKey, Properties urlProperties) {
		super(authorization, apiKey, urlProperties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.smscountry.restapi.client.groupcalls.GroupCallClient#createGroupCall(
	 * com.smscountry.restapi.client.groupcalls.GroupCallRequest)
	 */
	@Override
	public GroupCallResponse createGroupCall(final GroupCallRequest request) {
		final String url = getUrlProperties().getProperty("create_group_call_url");

		Entity<GroupCallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey()))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse getGroupCallDetails(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("get_group_call_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse getParticipantDetails(String groupCallUUID, String participantId) {
		final String url = getUrlProperties().getProperty("get_participant_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID, participantId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse getAllParticipantDetails(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("get_participant_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse playSoundGroupCall(final String groupCallUUID, final GroupCallRequest request) {
		final String url = getUrlProperties().getProperty("play_sound_group_call_url");

		Entity<GroupCallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse playSoundParticipantGroupCall(String groupCallUUID, String participantId,
			GroupCallRequest request) {
		final String url = getUrlProperties().getProperty("play_sound_participant_group_call_url");

		Entity<GroupCallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID, participantId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse muteParticipants(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("mute_all_participant_url");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse muteParticipant(String groupCallUUID, String participantId) {
		final String url = getUrlProperties().getProperty("mute_participant_url");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID, participantId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse unmuteParticipants(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("unmute_all_participant_url");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse unmuteParticipant(String groupCallUUID, String participantId) {
		final String url = getUrlProperties().getProperty("unmute_participant_url");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID, participantId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse startRecording(String groupCallUUID, GroupCallRequest request) {
		final String url = getUrlProperties().getProperty("create_group_call_url");

		Entity<GroupCallRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse stopRecording(String groupCallUUID, String recordingUUID) {
		final String url = getUrlProperties().getProperty("stop_recording_group_call");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID, recordingUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse stopAllRecordings(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("stop_all_recordings_group_call");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse getRecordingDetails(String groupCallUUID, String recordingUUID) {
		final String url = getUrlProperties().getProperty("get_recording_details_group_call");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID, recordingUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse getAllRecordingDetails(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("get_all_recording_details_group_call");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse deleteRecording(String groupCallUUID, String recordingUUID) {
		final String url = getUrlProperties().getProperty("delete_recording_group_call");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID, recordingUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).delete();
		final GroupCallResponse result = new GroupCallResponse();
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse deleteAllRecordings(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("delete_all_recording_group_call");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).delete();
		final GroupCallResponse result = new GroupCallResponse();
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse disconnectAllParticipants(String groupCallUUID) {
		final String url = getUrlProperties().getProperty("disconnect_all_participants");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupCallResponse disconnectParticipant(String groupCallUUID, String participantId) {
		final String url = getUrlProperties().getProperty("disconnect_participant");

		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupCallUUID, participantId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH");
		final GroupCallResponse result = response.readEntity(GroupCallResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

}
