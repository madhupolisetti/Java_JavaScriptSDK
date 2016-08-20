/**
 * 
 */
package com.smscountry.restapi.client.groupcalls;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class GroupCall {

	@JsonProperty("GroupCallUUID")
	private String id;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("WelcomeSound")
	private String welcomeSound;

	@JsonProperty("WaitSound")
	private String waitSound;

	@JsonProperty("StartGroupCallOnEnter")
	private String startGroupCallOnEnter;

	@JsonProperty("EndGroupCallOnExit")
	private String endGroupCallOnExit;

	@JsonProperty("Participants")
	private Participant[] participants;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the welcomeSound
	 */
	public String getWelcomeSound() {
		return welcomeSound;
	}

	/**
	 * @param welcomeSound
	 *            the welcomeSound to set
	 */
	public void setWelcomeSound(String welcomeSound) {
		this.welcomeSound = welcomeSound;
	}

	/**
	 * @return the waitSound
	 */
	public String getWaitSound() {
		return waitSound;
	}

	/**
	 * @param waitSound
	 *            the waitSound to set
	 */
	public void setWaitSound(String waitSound) {
		this.waitSound = waitSound;
	}

	/**
	 * @return the startGroupCallOnEnter
	 */
	public String getStartGroupCallOnEnter() {
		return startGroupCallOnEnter;
	}

	/**
	 * @param startGroupCallOnEnter
	 *            the startGroupCallOnEnter to set
	 */
	public void setStartGroupCallOnEnter(String startGroupCallOnEnter) {
		this.startGroupCallOnEnter = startGroupCallOnEnter;
	}

	/**
	 * @return the endGroupCallOnExit
	 */
	public String getEndGroupCallOnExit() {
		return endGroupCallOnExit;
	}

	/**
	 * @param endGroupCallOnExit
	 *            the endGroupCallOnExit to set
	 */
	public void setEndGroupCallOnExit(String endGroupCallOnExit) {
		this.endGroupCallOnExit = endGroupCallOnExit;
	}

}
