package in.ac.sit.evet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="CLIENT")
public class Client {

	@Id
	@GeneratedValue
	@Column(name = "CLIENT_ID")
	private int client_id;
	private String fname;
	private String lname;
	private String adhaarnumber;
	private String phone;
	private String email;
	private String address;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public Client(String fname, String lname, String adhaarnumber,
			String phone, String email, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adhaarnumber = adhaarnumber;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
}
