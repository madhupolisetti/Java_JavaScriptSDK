/**
 * 
 */
package com.smscountry.restapi.client.groupcalls;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class GroupCallRequest {

	@JsonProperty("Name")
	private String name;

	@JsonProperty("welcomeSound")
	private String welcomeSound;

	@JsonProperty("WaitSound")
	private String waitSound;

	@JsonProperty("StartGroupCallOnEnter")
	private String startGroupCallOnEnter;

	@JsonProperty("EndGroupCallOnExit")
	private String endGroupCallOnExit;

	@JsonProperty("Participants")
	private Participant[] participants;

	@JsonProperty("File")
	private String file;

	@JsonProperty("FileFormat")
	private String fileFormat;

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
	 * @return the file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(String file) {
		this.file = file;
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

}
