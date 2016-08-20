/**
 * 
 */
package com.smscountry.restapi.client.groupcalls;

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
	
	
	
}
