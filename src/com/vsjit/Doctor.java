package com.vsjit;

import java.util.List;

public class Doctor {
	
	Patient patId;
	private int docId;
	private String docName;
	private List pateintList;
	
	
	/*
	 * public Doctor(List pateintList) { super(); this.pateintList = pateintList; }
	 */
	public List getPateintList() {
		return pateintList;
	}
	public void setPateintList(List pateintList) {
		this.pateintList = pateintList;
	}
	public Doctor(Patient patId) {
		super();
		this.patId = patId;
	}
	public Patient getPatId() {
		return patId;
	}
	public void setPatId(Patient patId) {
		this.patId = patId;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	
	

}
