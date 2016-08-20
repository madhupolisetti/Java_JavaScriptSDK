/**
 * 
 */
package com.smscountry.restapi.client.groupcalls;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class GroupCallResponse {

	@JsonIgnore
	private int httpStatusCode;

	@JsonProperty("ApiId")
	private String apiId;

	@JsonProperty("Success")
	private String success;

	@JsonProperty("Message")
	private String message;

	@JsonProperty("GroupCall")
	private GroupCall groupCall;

	@JsonProperty("Participant")
	private Participant participant;

	@JsonProperty("Participants")
	private Participant[] participants;

	@JsonProperty("FailedParticipantIds")
	private int[] failedParticipantIds;

	@JsonProperty("Recording")
	private Recording recording;

	@JsonProperty("Recordings")
	private Recording[] recordings;

	@JsonProperty("AffectedRecordingUUIDs")
	private String[] affectedRecordingUUIDs;

	/**
	 * @return the httpStatusCode
	 */
	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	/**
	 * @param httpStatusCode
	 *            the httpStatusCode to set
	 */
	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	/**
	 * @return the apiId
	 */
	public String getApiId() {
		return apiId;
	}

	/**
	 * @param apiId
	 *            the apiId to set
	 */
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	/**
	 * @return the success
	 */
	public String getSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(String success) {
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the groupCall
	 */
	public GroupCall getGroupCall() {
		return groupCall;
	}

	/**
	 * @param groupCall
	 *            the groupCall to set
	 */
	public void setGroupCall(GroupCall groupCall) {
		this.groupCall = groupCall;
	}

	/**
	 * @return the participant
	 */
	public Participant getParticipant() {
		return participant;
	}

	/**
	 * @param participant
	 *            the participant to set
	 */
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	/**
	 * @return the participants
	 */
	public Participant[] getParticipants() {
		return participants;
	}

	/**
	 * @param participants
	 *            the participants to set
	 */
	public void setParticipants(Participant[] participants) {
		this.participants = participants;
	}

	/**
	 * @return the failedParticipantIds
	 */
	public int[] getFailedParticipantIds() {
		return failedParticipantIds;
	}

	/**
	 * @param failedParticipantIds
	 *            the failedParticipantIds to set
	 */
	public void setFailedParticipantIds(int[] failedParticipantIds) {
		this.failedParticipantIds = failedParticipantIds;
	}

	/**
	 * @return the recording
	 */
	public Recording getRecording() {
		return recording;
	}

	/**
	 * @param recording
	 *            the recording to set
	 */
	public void setRecording(Recording recording) {
		this.recording = recording;
	}

	/**
	 * @return the affectedRecordingUUIDs
	 */
	public String[] getAffectedRecordingUUIDs() {
		return affectedRecordingUUIDs;
	}

	/**
	 * @param affectedRecordingUUIDs
	 *            the affectedRecordingUUIDs to set
	 */
	public void setAffectedRecordingUUIDs(String[] affectedRecordingUUIDs) {
		this.affectedRecordingUUIDs = affectedRecordingUUIDs;
	}

	/**
	 * @return the recordings
	 */
	public Recording[] getRecordings() {
		return recordings;
	}

	/**
	 * @param recordings
	 *            the recordings to set
	 */
	public void setRecordings(Recording[] recordings) {
		this.recordings = recordings;
	}

}
