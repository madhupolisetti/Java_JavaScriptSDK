/**
 * 
 */
package com.smscountry.restapi.client.groups;

/**
 * @author Sajeesh
 *
 */
public interface GroupClient {

	public GroupResponse createGroup(final GroupRequest request);

	public GroupResponse getGroupDetails(final String groupId);

	public GroupResponse getGroupCollection(final String nameLike, final String startGroupCallOnEnter,
			final String endGroupCallOnExit, final String tinyName);

	public GroupResponse updateGroup(final String groupId, final GroupRequest request);

	public GroupResponse deleteGroup(final String groupId);

	public GroupResponse getMemberDetails(final String groupId, final String memberId);

	public GroupResponse getAllMembers(final String groupId);

	public GroupResponse updateMemberDetails(final String groupId, final String memberId, final Member member);
	
	public GroupResponse deleteMember(final String groupId, final String memberId);
	
	public GroupResponse addMember(final String groupId, final Member member);
}
