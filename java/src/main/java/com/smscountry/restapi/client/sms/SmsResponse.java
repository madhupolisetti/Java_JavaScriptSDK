/**
 * 
 */
package com.smscountry.restapi.client.sms;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class SmsResponse {

	@JsonIgnore
	private int httpCallCode;

	@JsonProperty("ApiId")
	private String apiId;

	@JsonProperty("Success")
	private String success;

	@JsonProperty("Message")
	private String message;

	@JsonProperty("MessageUUID")
	private String messageUUID;

	@JsonProperty("SMS")
	private SMS sms;

	@JsonProperty("SMSes")
	private SMS[] smsCollection;

	@JsonProperty("BatchId")
	private String batchId;

	@JsonProperty("MessageUUIDs")
	private String messageUUIDs;

	/**
	 * @return the batchId
	 */
	public String getBatchId() {
		return batchId;
	}

	/**
	 * @param batchId
	 *            the batchId to set
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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
	 * @return the messageUUID
	 */
	public String getMessageUUID() {
		return messageUUID;
	}

	/**
	 * @param messageUUID the messageUUID to set
	 */
	public void setMessageUUID(String messageUUID) {
		this.messageUUID = messageUUID;
	}

	/**
	 * @return the messageUUIDs
	 */
	public String getMessageUUIDs() {
		return messageUUIDs;
	}

	/**
	 * @param messageUUIDs the messageUUIDs to set
	 */
	public void setMessageUUIDs(String messageUUIDs) {
		this.messageUUIDs = messageUUIDs;
	}

	/**
	 * @return the sms
	 */
	public SMS getSms() {
		return sms;
	}

	/**
	 * @param sms
	 *            the sms to set
	 */
	public void setSms(SMS sms) {
		this.sms = sms;
	}

	/**
	 * @return the smsCollection
	 */
	public SMS[] getSmsCollection() {
		return smsCollection;
	}

	/**
	 * @param smsCollection
	 *            the smsCollection to set
	 */
	public void setSmsCollection(SMS[] smsCollection) {
		this.smsCollection = smsCollection;
	}

	/**
	 * @return the httpCallCode
	 */
	public int getHttpCallCode() {
		return httpCallCode;
	}

	/**
	 * @param httpCallCode
	 *            the httpCallCode to set
	 */
	public void setHttpCallCode(int httpCallCode) {
		this.httpCallCode = httpCallCode;
	}

}
