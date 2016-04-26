package in.ac.sit.evet.controller;

import in.ac.sit.evet.model.Doctor;
import in.ac.sit.evet.service.DoctorService;
import in.ac.sit.evet.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CreateDoctorController {
	
	@Autowired
	DoctorService doctorService;
	UserService userService;
	
	@RequestMapping(value="/createdoctor",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		ModelAndView mv=new ModelAndView("createdoctor");
		mv.addObject("command", new Doctor());
		/*mv.addObject("command", new User());*/
		return mv;
	}
	
	@RequestMapping(value="/createdoctor",method=RequestMethod.POST)
	public String createUser(@ModelAttribute("doctor")Doctor d)
	{
		System.out.println("Inside POST METHOD of user Controller");
		System.out.println(d);
		doctorService.createDoctor(d);
		//userService.createUser(u);
		return "redirect:createdoctor";
	}

}
