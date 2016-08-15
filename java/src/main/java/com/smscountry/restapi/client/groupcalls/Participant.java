/**
 * 
 */
package com.smscountry.restapi.client.groupcalls;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class Participant {

	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Id")
	private String id;
	
	@JsonProperty("Calls")
	private Call [] calls;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the calls
	 */
	public Call[] getCalls() {
		return calls;
	}

	/**
	 * @param calls the calls to set
	 */
	public void setCalls(Call[] calls) {
		this.calls = calls;
	}

	
}
