package in.ac.sit.evet.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DOCTOR")
public class Doctor {

	@Id
	@GeneratedValue
	@Column(name = "DOC_ID")
	private int doc_id;
	private String fname;
	private String lname;
	private String gender;
	private String dob;
	private String adhaarnumber;
	private String phone;
	private String address;
	private String specialization;
	
	private User user;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public Doctor(String fname, String lname, String gender, String dob,
			String adhaarnumber, String phone, String address,
			String specialization ) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.adhaarnumber = adhaarnumber;
		this.phone = phone;
		this.address = address;
		this.specialization = specialization;
	}
	public Doctor(int doc_id, String fname, String adhaarnumber, String phone,String specialization) {
		super();
		this.doc_id = doc_id;
		this.fname = fname;
		this.adhaarnumber = adhaarnumber;
		this.phone = phone;
		this.specialization = specialization;
	}
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "USER",
	        joinColumns = @JoinColumn(name = "DOC_ID"),
	        inverseJoinColumns = @JoinColumn(name = "USER_ID")
	)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
