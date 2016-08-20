/**
 * 
 */
package com.smscountry.restapi.client.sms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class SmsRequest {
	@JsonProperty("Text")
	private String text;

	@JsonProperty("Number")
	private String number;

	@JsonProperty("Numbers")
	private String[] numbers;

	@JsonProperty("SenderId")
	private String senderId;

	@JsonProperty("DRNotifyUrl")
	private String drNotifyUrl;

	@JsonProperty("DRNotifyHttpMethod")
	private String drNotifyHttpMethod;

	/**
	 * @return the text
	 */

	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

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
	 * @return the drNotifyUrl
	 */

	public String getDrNotifyUrl() {
		return drNotifyUrl;
	}

	/**
	 * @param drNotifyUrl
	 *            the drNotifyUrl to set
	 */
	public void setDrNotifyUrl(String drNotifyUrl) {
		this.drNotifyUrl = drNotifyUrl;
	}

	/**
	 * @return the drNotifyHttpMethod
	 */

	public String getDrNotifyHttpMethod() {
		return drNotifyHttpMethod;
	}

	/**
	 * @param drNotifyHttpMethod
	 *            the drNotifyHttpMethod to set
	 */
	public void setDrNotifyHttpMethod(String drNotifyHttpMethod) {
		this.drNotifyHttpMethod = drNotifyHttpMethod;
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

}
