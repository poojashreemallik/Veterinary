package org.vet.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.vet.entity.Case;
import org.vet.entity.Client;
import org.vet.entity.Farmer;
import org.vet.entity.User;
import org.vet.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/kannada")
	public String showKnn()
	{
		return "kn-home";
	}
	@RequestMapping("/english")
	public String showEng()
	{
		return "en-home";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginform(Model model)
	{
		
		return new ModelAndView("login", "command", new User());

	}
	
	//To Android application
	@RequestMapping(value="/loginUser", method=RequestMethod.POST)
	public String loginform1(@RequestBody User user,HttpSession session,BindingResult bindingResult,
			Model model)
	{
		String role=null;
		String id=user.getEmail();
		String password=user.getPassword();
		
		if((role=userservice.login(id,password))!=null)
		{
			session.setAttribute("USERID", id);
			
			if("doctor".equals(role))
			{
				
				return "true";
			}
			else
			{
				
				return "false";
			}
			
			
		}
		else
		{
			
			return "false";
		}
		

	}
	@RequestMapping("/register")
	public ModelAndView showform() 
	{
		return new ModelAndView("register", "command", new User());
    }
	
	@RequestMapping("/createUser")
	public ModelAndView create(User u)
	{
		String password="abcd";
		userservice.create(u);
		return new ModelAndView("login", "command", new User());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("email") String id,@RequestParam("password") String password,
			@ModelAttribute("user") User user,HttpSession session,BindingResult bindingResult)
	{
		String role=null;
		ModelAndView model=new ModelAndView();
		if((role=userservice.login(id,password))!=null)
		{
			session.setAttribute("USERID", id);
			
			if("doctor".equals(role))
			{
				ArrayList<Case> c=userservice.getCaselist();
				model.addObject("list", c);
				model.setViewName("doctor");
				return model;
			}
			else
			{
				//modelandView.addObject("command", new Client());
				model.setViewName("admin");
				return model;
			}
			
			
		}
		else
		{
			bindingResult.reject("Message", "Invalid User Id or Password");
			model.setViewName("login");
			return model;
		}
		
	}
	@RequestMapping(value="/createClient", method=RequestMethod.GET)
	public ModelAndView createClient()
	{
		
		return new ModelAndView("client", "command", new Client() );
	}
	
	@RequestMapping(value="/createClient", method=RequestMethod.POST)
	public ModelAndView createClients(@ModelAttribute("client") Client client,HttpSession session,BindingResult bindingResult,
			ModelAndView modelandView)
	{
		if(userservice.createClient(client))
		{
			bindingResult.reject("Message", "Case Created Successfully");
			return new ModelAndView("admin", "command", new Client() );
		}
		else
		{
			bindingResult.reject("Message", "Case Creation failure.Please try again");
			return new ModelAndView("client", "command", new Client() );
		}
		
	}
	@RequestMapping(value="/clientslist", method=RequestMethod.GET)
	public ModelAndView clientslist()
	{
		ArrayList<Client> c=userservice.getClientlist();
		System.out.println(c);
		ModelAndView model=new ModelAndView();
		model.addObject(new Client());
		model.addObject("list", c);
		model.setViewName("clients");
		return model;
	}
	@RequestMapping(value="/createCase", method=RequestMethod.POST)
	public ModelAndView createCase(@ModelAttribute("farmer") Farmer f,HttpSession session,BindingResult bindingResult)
	{
		int id=f.getClient().getClientid();
		System.out.println(id);
		ModelAndView model=new ModelAndView();
		if(userservice.createCase(f.getCase1(),id))
		{
			bindingResult.reject("Message", "Case Created Successfully");
			return new ModelAndView("admin", "command", new Case() );
		}
		else
		{
			
			bindingResult.reject("Message", "Case Creation failure.Please try again");
			model.addObject("command", new Case());
			model.addObject("client", new Client());
			model.setViewName("case");
			return model;
		}
	}
	@RequestMapping(value="/clientcase", method=RequestMethod.GET)
	public String clientcase(@RequestParam("id")int id)
	{
		Client c=new Client();
		c.setClientid(id);
		
		Farmer farmer=new Farmer();
		farmer.setCase1(new Case());
		farmer.setClient(c);
		
		ModelAndView model=new ModelAndView();
		model.addObject("command", farmer); 
		 
	    return "redirect:case";
		
	}
	@RequestMapping(value="/casedetails", method=RequestMethod.GET)
	public ModelAndView casedetails()
	{
		ArrayList<Farmer> f=userservice.getCasedetails();
		System.out.println(f);
		ModelAndView model=new ModelAndView();
		model.addObject(new Farmer());
		model.addObject("farmer", f);
		model.setViewName("casedetails");
		return model;
	}
}

