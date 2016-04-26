package in.ac.sit.evet.controller;

import in.ac.sit.evet.model.User;
import in.ac.sit.evet.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String createUser(@RequestParam("username")String username,@RequestParam("password")String password,
			@ModelAttribute("user") User user,BindingResult bindingResult,
			ModelAndView modelandView)
	{
		System.out.println("Inside POST METHOD of Login Controller");
		String role=null;
		
		if((role=userService.login(username, password))!=null)
		{
			//session.setAttribute("USERID", username);
			
			if("doctor".equals(role))
			{
				return "tasks";
			}
			else
			{
				return "gpotasks";
			}
			
			
		}
		else
		{
			bindingResult.reject("Message", "Invalid User Id or Password");
			return "redirect:login";
		}
		
		
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if("gpo".equals(role))
		{
			return "gpotasks";
		}
		else if("doctor".equals(role))
		{
			return "tasks";
		}
		else if("fo".equals(role))
		{
			return "tasks";
		}
		return "redirect:login";*/
	


