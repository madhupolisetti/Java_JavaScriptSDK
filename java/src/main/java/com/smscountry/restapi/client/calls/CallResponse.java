/**
 * 
 */
package com.smscountry.restapi.client.calls;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Sajeesh
 *
 */
public class CallResponse {

	@JsonIgnore
	private int httpStatusCode;

	@JsonProperty("ApiId")
	private String apiId;

	@JsonProperty("Success")
	private String success;

	@JsonProperty("Message")
	private String message;

	@JsonProperty("CallUUID")
	private String callUUID;

	@JsonProperty("CallUUIDs")
	private String[] callUUIDs;

	@JsonProperty("Calls")
	private Call[] calls;

	@JsonProperty("Recording")
	private Recording recording;

	@JsonProperty("Recordings")
	private Recording[] recordings;

	@JsonProperty("AffectedCallUUIDs")
	private String[] affectedCallUUIDs;

	@JsonProperty("GatewayId")
	private String gatewayId;

	@JsonProperty("Next")
	private String next;

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
	 * @return the callUUID
	 */
	public String getCallUUID() {
		return callUUID;
	}

	/**
	 * @param callUUID
	 *            the callUUID to set
	 */
	public void setCallUUID(String callUUID) {
		this.callUUID = callUUID;
	}

	/**
	 * @return the callUUIDs
	 */
	public String[] getCallUUIDs() {
		return callUUIDs;
	}

	/**
	 * @param callUUIDs
	 *            the callUUIDs to set
	 */
	public void setCallUUIDs(String[] callUUIDs) {
		this.callUUIDs = callUUIDs;
	}

	/**
	 * @return the calls
	 */
	public Call[] getCalls() {
		return calls;
	}

	/**
	 * @param calls
	 *            the calls to set
	 */
	public void setCalls(Call[] calls) {
		this.calls = calls;
	}

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

	/**
	 * @return the affectedCallUUIDs
	 */
	public String[] getAffectedCallUUIDs() {
		return affectedCallUUIDs;
	}

	/**
	 * @param affectedCallUUIDs
	 *            the affectedCallUUIDs to set
	 */
	public void setAffectedCallUUIDs(String[] affectedCallUUIDs) {
		this.affectedCallUUIDs = affectedCallUUIDs;
	}

	/**
	 * @return the gatewayId
	 */
	public String getGatewayId() {
		return gatewayId;
	}

	/**
	 * @param gatewayId
	 *            the gatewayId to set
	 */
	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	/**
	 * @return the next
	 */
	public String getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(String next) {
		this.next = next;
	}

}
