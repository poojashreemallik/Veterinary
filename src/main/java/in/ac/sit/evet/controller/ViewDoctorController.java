package in.ac.sit.evet.controller;

import in.ac.sit.evet.model.Doctor;
import in.ac.sit.evet.service.DoctorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ViewDoctorController {

	@Autowired
	DoctorService doctorService;
	
	@RequestMapping(value="/viewdoctors",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		System.out.println("Inside GET Method of User Controller");
		ModelAndView mv=new ModelAndView("viewdoctors");
		List<Doctor> doctor=doctorService.viewDoctor();
		mv.addObject("doctor",doctor);
		return mv;
		
	}	
}
