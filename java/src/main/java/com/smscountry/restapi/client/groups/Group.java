/**
 * 
 */
package com.smscountry.restapi.client.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sajeesh
 *
 */
public class Group {

	@JsonProperty("Id")
	private String id;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("TinyName")
	private String tinyName;

	@JsonProperty("StartGroupCallOnEnter")
	private String startGroupCallOnEnter;

	@JsonProperty("EndGroupCallOnExit")
	private String endGroupCallOnExit;

	@JsonProperty("Members")
	private Member[] members;

	@JsonProperty("Links")
	private Link[] links;

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
	 * @return the tinyName
	 */
	public String getTinyName() {
		return tinyName;
	}

	/**
	 * @param tinyName
	 *            the tinyName to set
	 */
	public void setTinyName(String tinyName) {
		this.tinyName = tinyName;
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
	 * @return the members
	 */
	public Member[] getMembers() {
		return members;
	}

	/**
	 * @param members
	 *            the members to set
	 */
	public void setMembers(Member[] members) {
		this.members = members;
	}

	/**
	 * @return the links
	 */
	public Link[] getLinks() {
		return links;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(Link[] links) {
		this.links = links;
	}

}
