package org.vet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_PROFILE")
public class User 
{
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int user_id;
	
	private String email;
	private String password;
	private String role;
	
	private String fname;
	private String lname;
	private String gender;
	private String dob;
	private String adhaarno;
	private String phone;
	
	private String address;
	private String specialization;
	
	public User() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
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
	public String getAdhaarno() {
		return adhaarno;
	}
	public void setAdhaarno(String adhaarno) {
		this.adhaarno = adhaarno;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public User(String username, String password, String role, String fname,
			String lname, String gender, String dob, String adhaarno,
			String phone, String address, String email, String specialization) {
		super();	
		this.password = password;
		this.role = role;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.adhaarno = adhaarno;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.specialization = specialization;
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", role="
				+ role + ", fname=" + fname + ", lname=" + lname + ", gender="
				+ gender + ", dob=" + dob + ", adhaarno=" + adhaarno
				+ ", phone=" + phone + ", address=" + address
				+ ", specialization=" + specialization + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
}
