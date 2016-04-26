package in.ac.sit.evet.controller;

import java.util.List;

import in.ac.sit.evet.model.Case;
import in.ac.sit.evet.service.CaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchCaseController {
	
	@Autowired
	CaseService caseService;
	
	@RequestMapping(value="/casebyid", method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		System.out.println("Inside the search case controller");
		return new ModelAndView("searchedcase","command",new Case());
	}
	
	@RequestMapping(value="/casebyid",method=RequestMethod.POST)
	public ModelAndView searchCase(@RequestParam("case_id")int case_id)
	{
		ModelAndView mv=new ModelAndView("searchedcase");
		List<Case> caselist=caseService.searchCase(case_id);
		mv.addObject("caselist", caselist);
		return mv;
	}

	
}
