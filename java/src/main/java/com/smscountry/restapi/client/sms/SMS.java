/**
 * 
 */
package com.smscountry.restapi.client.sms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class SMS {

	@JsonProperty("MessageUUID")
	private String messageUUID;
	
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Text")
	private String text;
	
	@JsonProperty("DoneTime")
	private String doneTime;
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("Cost")
	private String cost;
	
	@JsonProperty("Currency")
	private String currency;

	/**
	 * @return the messageUUID
	 */
	
	protected String getMessageUUID() {
		return messageUUID;
	}

	/**
	 * @param messageUUID
	 *            the messageUUID to set
	 */
	protected void setMessageUUID(String messageUUID) {
		this.messageUUID = messageUUID;
	}

	/**
	 * @return the number
	 */
	
	protected String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	protected void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the text
	 */
	protected String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	protected void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the doneTime
	 */

	protected String getDoneTime() {
		return doneTime;
	}

	/**
	 * @param doneTime
	 *            the doneTime to set
	 */
	protected void setDoneTime(String doneTime) {
		this.doneTime = doneTime;
	}

	/**
	 * @return the status
	 */
	protected String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	protected void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * @return the currency
	 */
	protected String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	protected void setCurrency(String currency) {
		this.currency = currency;
	}

}
