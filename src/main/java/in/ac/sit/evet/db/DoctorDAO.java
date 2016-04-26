package in.ac.sit.evet.db;

import in.ac.sit.evet.model.Doctor;

import java.util.List;



public interface DoctorDAO {

	public int createDoctor(Doctor d);
	
	public List<Doctor> viewDoctor();
}
