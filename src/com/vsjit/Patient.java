package com.vsjit;

import org.springframework.stereotype.Component;


public class Patient {

	private int patId;
	private String patName;
	private int patAge;

	public int getPatId() {
		return patId;
	}

	public Patient(int patId, String patName, int patAge) {
		super();
		this.patId = patId;
		this.patName = patName;
		this.patAge = patAge;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public int getPatAge() {
		return patAge;
	}

	public void setPatAge(int patAge) {
		this.patAge = patAge;
	}

}
