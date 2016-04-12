package org.vet.entity;

public class Client {
	
	private int clientid;
	private String farmerName; 
	private String adhaarnumber;
	private String phone;
	private String email;
	private String address;
	
	
	public Client() {
		super();
	}
	
	public Client(String farmerName, String phone, String email, String address) {
		super();
		this.farmerName = farmerName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public Client(int clientid, String farmerName) {
		super();
		this.clientid = clientid;
		this.farmerName = farmerName;
	}

	public String getAdhaarnumber() {
		return adhaarnumber;
	}
	public void setAdhaarnumber(String adhaarnumber) {
		this.adhaarnumber = adhaarnumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", farmerName=" + farmerName
				+ ", adhaarnumber=" + adhaarnumber + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + "]";
	}

}
