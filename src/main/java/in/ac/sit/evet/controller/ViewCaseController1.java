package in.ac.sit.evet.controller;

import in.ac.sit.evet.service.CaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ViewCaseController1 {

	@Autowired
	CaseService caseService;
	
	@RequestMapping(value="/viewcase",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		System.out.println("Inside GET Method of User Controller");
		ModelAndView mv=new ModelAndView("viewcase");

		mv.addObject("cases",caseService.viewAllCases());
		
		return mv;
	}	

}
