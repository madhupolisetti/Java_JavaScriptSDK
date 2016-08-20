/**
 * 
 */
package com.smscountry.restapi.client.calls;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class Recording {

	@JsonProperty("RecordingUUID")
	private String recordingUUID;
	
	@JsonProperty("Url")
	private String url;
	
	@JsonProperty("Duration")
	private int duration;

	/**
	 * @return the recordingUUID
	 */
	public String getRecordingUUID() {
		return recordingUUID;
	}

	/**
	 * @param recordingUUID the recordingUUID to set
	 */
	public void setRecordingUUID(String recordingUUID) {
		this.recordingUUID = recordingUUID;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
