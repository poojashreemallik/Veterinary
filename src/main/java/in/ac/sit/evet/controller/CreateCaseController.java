	package in.ac.sit.evet.controller;

import in.ac.sit.evet.model.Case;
import in.ac.sit.evet.service.CaseService;

import java.sql.Blob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller 
public class CreateCaseController {

	@Autowired
	CaseService caseService;
	
	@RequestMapping(value="/createcase",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("case", new Case());
		mv.setViewName("createcase");
		System.out.println("Inside GET Method of Assessment Controller");
		return mv;
	}
	

	@RequestMapping(value="/createcase",method=RequestMethod.POST)
	public String createUser(@ModelAttribute("client")Case c)
	{
		System.out.println("Inside POST METHOD of case Controller");
		System.out.println(c);
		//File img=c.getImage();
		//Blob img=c.getImage();
		caseService.createCase(c);
		return "redirect:viewcases";
	}
	
	
	
	/*public String createCase(@ModelAttribute("assessmentFormBean")AssessmentFormBean assessmentFormBean)
	{
		System.out.println("Inside POST METHOD of Assessment Controller");
		System.out.println(assessmentFormBean);
		Case Case = CaseHelper.buildAssessmentFromFormBean(assessmentFormBean);
		caseService.createCase(Case);
		return "redirect:createcase";
	}*/
	
	
}
