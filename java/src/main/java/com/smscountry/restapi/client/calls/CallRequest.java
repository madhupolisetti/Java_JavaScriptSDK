/**
 * 
 */
package com.smscountry.restapi.client.calls;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class CallRequest {

	@JsonProperty("Number")
	private String number;

	@JsonProperty("Numbers")
	private String[] numbers;

	@JsonProperty("CallerId")
	private String senderId;

	@JsonProperty("RingUrl")
	private String ringUrl;

	@JsonProperty("AnswerUrl")
	private String answerUrl;

	@JsonProperty("HangupUrl")
	private String hangupUrl;

	@JsonProperty("HttpMethod")
	private String HttpMethod;

	@JsonProperty("Sounds")
	private String[] sounds;

	@JsonProperty("Legs")
	private String leg;

	@JsonProperty("Length")
	private int length;

	@JsonProperty("FileFormat")
	private String fileFormat;

	@JsonProperty("TimeLimit")
	private int timeLimit;

	@JsonProperty("CallUUIDs")
	private String[] callUUIDs;

	@JsonProperty("Xml")
	private String xml;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the senderId
	 */
	public String getSenderId() {
		return senderId;
	}

	/**
	 * @param senderId
	 *            the senderId to set
	 */
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	/**
	 * @return the ringUrl
	 */
	public String getRingUrl() {
		return ringUrl;
	}

	/**
	 * @param ringUrl
	 *            the ringUrl to set
	 */
	public void setRingUrl(String ringUrl) {
		this.ringUrl = ringUrl;
	}

	/**
	 * @return the answerUrl
	 */
	public String getAnswerUrl() {
		return answerUrl;
	}

	/**
	 * @param answerUrl
	 *            the answerUrl to set
	 */
	public void setAnswerUrl(String answerUrl) {
		this.answerUrl = answerUrl;
	}

	/**
	 * @return the hangupUrl
	 */
	public String getHangupUrl() {
		return hangupUrl;
	}

	/**
	 * @param hangupUrl
	 *            the hangupUrl to set
	 */
	public void setHangupUrl(String hangupUrl) {
		this.hangupUrl = hangupUrl;
	}

	/**
	 * @return the httpMethod
	 */
	public String getHttpMethod() {
		return HttpMethod;
	}

	/**
	 * @param httpMethod
	 *            the httpMethod to set
	 */
	public void setHttpMethod(String httpMethod) {
		HttpMethod = httpMethod;
	}

	/**
	 * @return the numbers
	 */
	public String[] getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers
	 *            the numbers to set
	 */
	public void setNumbers(String[] numbers) {
		this.numbers = numbers;
	}

	/**
	 * @return the sounds
	 */
	public String[] getSounds() {
		return sounds;
	}

	/**
	 * @param sounds
	 *            the sounds to set
	 */
	public void setSounds(String[] sounds) {
		this.sounds = sounds;
	}

	/**
	 * @return the leg
	 */
	public String getLeg() {
		return leg;
	}

	/**
	 * @param leg
	 *            the leg to set
	 */
	public void setLeg(String leg) {
		this.leg = leg;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the fileFormat
	 */
	public String getFileFormat() {
		return fileFormat;
	}

	/**
	 * @param fileFormat
	 *            the fileFormat to set
	 */
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	/**
	 * @return the timeLimit
	 */
	public int getTimeLimit() {
		return timeLimit;
	}

	/**
	 * @param timeLimit
	 *            the timeLimit to set
	 */
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
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
	 * @return the xml
	 */
	public String getXml() {
		return xml;
	}

	/**
	 * @param xml
	 *            the xml to set
	 */
	public void setXml(String xml) {
		this.xml = xml;
	}

}
