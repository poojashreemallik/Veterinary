package in.ac.sit.evet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CASE_ACTION")
public class CaseAction {
	
	@Id
	@GeneratedValue
	@Column(name = "CASE_ACTION_ID")
	private int case_action_id;
	public Case cases;
	public Doctor doctor;
	public String description;
	public int getCase_action_id() {
		return case_action_id;
	}
	public void setCase_action_id(int case_action_id) {
		this.case_action_id = case_action_id;
	}
	public Case getCases() {
		return cases;
	}
	public void setCases(Case cases) {
		this.cases = cases;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CaseAction(Case cases, Doctor doctor, String description) {
		super();
		this.cases = cases;
		this.doctor = doctor;
		this.description = description;
	}
	
	
}
