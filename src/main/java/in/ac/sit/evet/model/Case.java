package in.ac.sit.evet.model;

import java.io.File;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="VET_CASE")

	
public class Case {

	
	private int case_id;
	private String description ;
	private String symptoms;
	private String status;
	//private Blob image;
	
	private String prescription;
	private File image;
	
	private byte[] imageRawData;
	
	/*public Case(int case_id, String description, String symptoms,
			String status, Blob blob) {
		super();
		this.case_id = case_id;
		this.description = description;
		this.symptoms = symptoms;
		this.status = status;
		this.image = blob;
	}
	
	public Case(Blob image) {
		super();
		this.image = image;
	}*/

	public Case() {
		super();
	}

	
/*
	public Case(int case_id, String description, String symptoms,
			String status, File image) {
		super();
		this.case_id = case_id;
		this.description = description;
		this.symptoms = symptoms;
		this.status = status;
		this.image = image;
	}*/



	/*@Override
	public String toString() {
		return "Case [case_id=" + case_id + ", description=" + description
				+ ", symptoms=" + symptoms + ", status=" + status + ", image="
				+ image + "]";
	}*/

	public Case(int case_id, String description, String symptoms, String status) {
		super();
		this.case_id = case_id;
		this.description = description;
		this.symptoms = symptoms;
		this.status = status;
	}

	@Id
	@GeneratedValue
	@Column(name = "CASE_ID")
	public int getCase_id() {
		return case_id;
	}
	public void setCase_id(int case_id) {
		this.case_id = case_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	/*public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}
*/
	public byte[] getImageRawData() {
		return imageRawData;
	}

	public void setImageRawData(byte[] imageRawData) {
		this.imageRawData = imageRawData;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	
	
}
