package com.fnp.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;
	
//
/**
 * @author Saransh vijay
 * The Class Employee.
 */
public class Employee {

	/** The id. */
	private List<Integer> id;
	
	/** The name. */
	private Set<String> name;
	
	/** The membership. */
	private Map<Integer, String> membership;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public List<Integer> getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(List<Integer> id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public Set<String> getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	public void setName(Set<String> name) {
		this.name = name;
	}
	
	
	
	/**
	 * Gets the membership.
	 *
	 * @return the membership
	 */
	public Map<Integer, String> getMembership() {
		return membership;
	}

	/**
	 * Sets the membership.
	 *
	 * @param membership the membership to set
	 */
	public void setMembership(Map<Integer, String> membership) {
		this.membership = membership;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", membership=" + membership + "]";
	}

	
	
}
