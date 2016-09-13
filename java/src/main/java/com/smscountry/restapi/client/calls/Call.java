/**
 * 
 */
package com.smscountry.restapi.client.calls;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class Call {

	@JsonProperty("CallUUID")
	private String callUUID;

	@JsonProperty("Number")
	private String number;

	@JsonProperty("RingTime")
	private String ringTime;

	@JsonProperty("AnswerTime")
	private String answerTime;

	@JsonProperty("EndTime")
	private String endTime;

	@JsonProperty("EndReason")
	private String endReason;

	@JsonProperty("Status")
	private String status;

	@JsonProperty("Cost")
	private String cost;

	@JsonProperty("Currency")
	private String currency;

	@JsonProperty("Direction")
	private String direction;

	@JsonProperty("Pulse")
	private String pulse;

	@JsonProperty("Pulses")
	private String pulses;

	@JsonProperty("PricePerPulse")
	private String pricePerPulse;

	@JsonProperty("CallerId")
	private String callerId;

	@JsonProperty("ToolName")
	private String toolName;

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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
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
	 * @return the ringTime
	 */
	public String getRingTime() {
		return ringTime;
	}

	/**
	 * @param ringTime
	 *            the ringTime to set
	 */
	public void setRingTime(String ringTime) {
		this.ringTime = ringTime;
	}

	/**
	 * @return the answerTime
	 */
	public String getAnswerTime() {
		return answerTime;
	}

	/**
	 * @param answerTime
	 *            the answerTime to set
	 */
	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the endReason
	 */
	public String getEndReason() {
		return endReason;
	}

	/**
	 * @param endReason
	 *            the endReason to set
	 */
	public void setEndReason(String endReason) {
		this.endReason = endReason;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the pulse
	 */
	public String getPulse() {
		return pulse;
	}

	/**
	 * @param pulse
	 *            the pulse to set
	 */
	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	/**
	 * @return the pulses
	 */
	public String getPulses() {
		return pulses;
	}

	/**
	 * @param pulses
	 *            the pulses to set
	 */
	public void setPulses(String pulses) {
		this.pulses = pulses;
	}

	/**
	 * @return the pricePerPulse
	 */
	public String getPricePerPulse() {
		return pricePerPulse;
	}

	/**
	 * @param pricePerPulse
	 *            the pricePerPulse to set
	 */
	public void setPricePerPulse(String pricePerPulse) {
		this.pricePerPulse = pricePerPulse;
	}

	/**
	 * @return the callerId
	 */
	public String getCallerId() {
		return callerId;
	}

	/**
	 * @param callerId
	 *            the callerId to set
	 */
	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}

	/**
	 * @return the toolName
	 */
	public String getToolName() {
		return toolName;
	}

	/**
	 * @param toolName
	 *            the toolName to set
	 */
	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

}
