/**
 * 
 */
package com.smscountry.restapi.client.groups;

import java.text.MessageFormat;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.HttpUrlConnectorProvider;

import com.smscountry.restapi.client.GenericClient;
import com.smscountry.restapi.client.calls.CallResponse;;

/**
 * @author Sajeesh
 *
 */
public class GroupClientImpl extends GenericClient implements GroupClient {

	public GroupClientImpl(String authorization, String apiKey, Properties urlProperties) {
		super(authorization, apiKey, urlProperties);
	}

	@Override
	public GroupResponse createGroup(final GroupRequest request) {
		final String url = getUrlProperties().getProperty("create_group_url");

		Entity<GroupRequest> payload = Entity.json(request);
		Response response = getClient().target(MessageFormat.format(url, getApiKey()))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse getGroupDetails(String groupId) {
		final String url = getUrlProperties().getProperty("get_group_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse getGroupCollection(String nameLike, String startGroupCallOnEnter, String endGroupCallOnExit,
			String tinyName) {
		final String url = getUrlProperties().getProperty("get_group_collections_url");

		Response response = getClient()
				.target(MessageFormat.format(url, getApiKey(), nameLike, startGroupCallOnEnter, endGroupCallOnExit,
						tinyName))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse updateGroup(final String groupId, GroupRequest request) {
		final String url = getUrlProperties().getProperty("update_group_url");

		Entity<GroupRequest> payload = Entity.json(request);
			
		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH", payload);
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse deleteGroup(final String groupId) {
		final String url = getUrlProperties().getProperty("delete_group_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.delete();
		final GroupResponse result = new GroupResponse();
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse getMemberDetails(String groupId, String memberId) {
		final String url = getUrlProperties().getProperty("get_member_details_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupId, memberId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse getAllMembers(String groupId) {
		final String url = getUrlProperties().getProperty("get_all_members_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization()).get();
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse updateMemberDetails(final String groupId, final String memberId, final Member member) {
		final String url = getUrlProperties().getProperty("update_member_details_url");

		Entity<Member> payload = Entity.json(member);
		Response response = getClient()
				.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
				.target(MessageFormat.format(url, getApiKey(), groupId, memberId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.method("PATCH", payload);
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse deleteMember(String groupId, String memberId) {
		final String url = getUrlProperties().getProperty("delete_member_url");

		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupId, memberId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.delete();
		final GroupResponse result = new GroupResponse();
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

	@Override
	public GroupResponse addMember(String groupId, Member member) {
		final String url = getUrlProperties().getProperty("add_member_url");

		Entity<Member> payload = Entity.json(member);
		Response response = getClient().target(MessageFormat.format(url, getApiKey(), groupId))
				.request(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Basic " + getAuthorization())
				.post(payload);
		final GroupResponse result = response.readEntity(GroupResponse.class);
		result.setHttpStatusCode(response.getStatus());
		return result;
	}

}
