package org.vet.entity;

public class Farmer {
	
	private Client client;
	private Case case1;
	
	
	
	public Farmer() {
		super();
	}
	public Farmer(Client client, Case case1) {
		super();
		this.client = client;
		this.case1 = case1;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Case getCase1() {
		return case1;
	}
	public void setCase1(Case case1) {
		this.case1 = case1;
	}
	
	

}
