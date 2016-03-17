package org.ndt.training.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ndt.training.dao.UnicodeDAO;
import org.ndt.training.entity.Unicode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
public class WelcomeController extends AbstractController{
	
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("WelcomePage");
		return model;
	}


/*@Controller
public class WelcomeController
{

	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public ModelAndView home()
	{
		//System.out.println("hiii");
		return new ModelAndView("WelcomePage");
	}
*/



	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView unicode(@ModelAttribute("unicode")Unicode unicode)
	{
		System.out.println("before creation");
		String unicodeData=unicode.getComment();
		UnicodeDAO.create(unicodeData);
		System.out.println("after creation");
		ArrayList<Unicode> u=UnicodeDAO.getList();
		ModelAndView mv= new ModelAndView("unicode");
		mv.addObject("list", u);
		mv.addObject("msg", "&#3240;&#3246;&#3256;&#3277;");
		//mv.addObject("command", new Unicode());
		mv.setViewName("WelcomePage");
		return mv;
		
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String table()
	{
		ArrayList<Unicode> list=UnicodeDAO.getList();
		
		return "WelcomePage";
	}
	
	@RequestMapping("/list")
	public ModelAndView showtable(ModelAndView modelandView,@ModelAttribute("unicode") Unicode st,HttpServletRequest request, HttpSession session) 
	{
	
		
		ArrayList<Unicode> u=UnicodeDAO.getList();
		
		ModelAndView mv= new ModelAndView("unicode");
		mv.addObject("list", u);
		mv.addObject("command", new Unicode());
		return mv;
    }
}