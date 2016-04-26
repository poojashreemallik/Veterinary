package in.ac.sit.evet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="CASE_ASSIGNMENT")
public class CaseAssignment {
	
	@Id
	@GeneratedValue
	@Column(name = "CASE_ASS_ID")
	private int case_ass_id;
	private int case_id;
	private int user_id;
	private String start_date;
	private String end_date;
	
	public int getCase_ass_id() {
		return case_ass_id;
	}
	public void setCase_ass_id(int case_ass_id) {
		this.case_ass_id = case_ass_id;
	}
	public int getCase_id() {
		return case_id;
	}
	public void setCase_id(int case_id) {
		this.case_id = case_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public CaseAssignment(int case_ass_id, int case_id, int user_id,
			String start_date, String end_date) {
		super();
		this.case_ass_id = case_ass_id;
		this.case_id = case_id;
		this.user_id = user_id;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public CaseAssignment() {
		super();
	}
	
	

}
