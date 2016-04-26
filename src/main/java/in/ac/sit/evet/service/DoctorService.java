package in.ac.sit.evet.service;

import in.ac.sit.evet.db.DoctorDAO;
import in.ac.sit.evet.model.Doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorService {

	@Autowired
	DoctorDAO dao;
	
	public int createDoctor(Doctor d)
		{
			return dao.createDoctor(d);
		}
		public List<Doctor> viewDoctor()
		{
			return dao.viewDoctor();
		}
		
	}

