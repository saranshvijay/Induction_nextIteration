package com.fnp.dto;

public class Student {
	
	private int id;
	private Employee e;
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the e
	 */
	public Employee getE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(Employee e) {
		this.e = e;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", e=" + e + "]";
	}
	
	
}
