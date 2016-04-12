package org.vet.entity;

public class Case {
	
	private int caseid;
	private String description;
	private String Symptoms;
	private String status;
	
	
	public Case() {
		super();
	}
	
	

	public Case(String description, String symptoms) {
		super();
		this.description = description;
		Symptoms = symptoms;
	}



	public Case(int caseid, String status) {
		super();
		this.caseid = caseid;
		this.status = status;
	}



	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSymptoms() {
		return Symptoms;
	}
	public void setSymptoms(String symptoms) {
		Symptoms = symptoms;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCaseid() {
		return caseid;
	}
	public void setCaseid(int caseid) {
		this.caseid = caseid;
	}

	@Override
	public String toString() {
		return "Case [caseid=" + caseid + ", description=" + description
				+ ", Symptoms=" + Symptoms + ", status=" + status + "]";
	}
	
	
}
