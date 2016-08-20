/**
 * 
 */
package com.smscountry.restapi.client.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class Link {

	@JsonProperty("Members")
	private String members;

	/**
	 * @return the members
	 */
	public String getMembers() {
		return members;
	}

	/**
	 * @param members
	 *            the members to set
	 */
	public void setMembers(String members) {
		this.members = members;
	}

}
