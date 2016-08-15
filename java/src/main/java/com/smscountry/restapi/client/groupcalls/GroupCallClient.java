/**
 * 
 */
package com.smscountry.restapi.client.groupcalls;

/**
 * @author Sajeesh
 *
 */
public interface GroupCallClient {

	public GroupCallResponse createGroupCall(final GroupCallRequest request);

	public GroupCallResponse getGroupCallDetails(final String groupCallUUID);

	public GroupCallResponse getParticipantDetails(final String groupCallUUID, final String participantId);

	public GroupCallResponse getAllParticipantDetails(final String groupCallUUID);

	public GroupCallResponse playSoundGroupCall(final String groupCallUUID, final GroupCallRequest request);

	public GroupCallResponse playSoundParticipantGroupCall(final String groupCallUUID, final String participantId,
			final GroupCallRequest request);
	
	public GroupCallResponse muteParticipants(final String groupCallUUID);
	
	public GroupCallResponse muteParticipant(final String groupCallUUID, final String participantId);
	
	public GroupCallResponse unmuteParticipants(final String groupCallUUID);
	
	public GroupCallResponse unmuteParticipant(final String groupCallUUID, final String participantId);
	
	public GroupCallResponse startRecording(final String groupCallUUID, final GroupCallRequest request);
	
	public GroupCallResponse stopRecording(final String groupCallUUID, final String recordingUUID);
	
	public GroupCallResponse stopAllRecordings(final String groupCallUUID);
	
	public GroupCallResponse getRecordingDetails(final String groupCallUUID, final String recordingUUID);
	
	public GroupCallResponse getAllRecordingDetails(final String groupCallUUID);
	
	public GroupCallResponse deleteRecording(final String groupCallUUID, final String recordingUUID);
	
	public GroupCallResponse deleteAllRecordings(final String groupCallUUID);
	
	public GroupCallResponse disconnectAllParticipants(final String groupCallUUID);
	
	public GroupCallResponse disconnectParticipant(final String groupCallUUID, final String participantId);
}
