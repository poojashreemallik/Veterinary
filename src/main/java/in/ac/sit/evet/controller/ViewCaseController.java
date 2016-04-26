package in.ac.sit.evet.controller;

import in.ac.sit.evet.model.Case;
import in.ac.sit.evet.service.CaseService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ViewCaseController {

	@Autowired
	CaseService caseService;
	
	@RequestMapping(value="/viewcases",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		System.out.println("Inside GET Method of User Controller");
		ModelAndView mv=new ModelAndView("viewcase");

		mv.addObject("cases",caseService.viewAllCases());
		
		return mv;
	}	
	@RequestMapping(value="/addprescription",method=RequestMethod.POST)
	public ModelAndView prescription(@RequestParam("case_id")int id, @ModelAttribute("case")Case c)
	{
		System.out.println("Inside GET Method of User Controller");
		ModelAndView mv=new ModelAndView("viewcase");
		mv.addObject("cases",caseService.viewAllCases());
		c.setCase_id(id);
		if(caseService.addprescription(c))
		{
			System.out.println("successfully prescription added");
		}
		else
		{
			System.out.println("Failure");

			
		}
		return mv;
		
		
	}	

}
