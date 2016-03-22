package org.vet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.vet.entity.User;

@Controller
public class UserController {
	
	/*@RequestMapping(value = "/login")
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {

		if("admin".equals(user.getEmail()) && "admin".equals(user.getPassword()))
		{
			modelandView.addObject("USERID",user.getEmail());
			modelandView.setViewName("kn-home");
		}
		else
		{
			bindingResult.reject("Message", "Invalid User Id or Password");
			modelandView.setViewName("en-home");
		}
		ModelAndView model = new ModelAndView("login");
		return model;
	}*/
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
	@RequestMapping("/register")
	public ModelAndView showform() 
	{
		return new ModelAndView("register", "command", new User());
    }
	
	@RequestMapping("/login")
	public String login(@RequestParam("emailId") String id,@RequestParam("password") String password,
			@ModelAttribute("user") User user,HttpSession session,BindingResult bindingResult,
			ModelAndView modelandView)
	{
		/*String role=null;
		if((role=userService.login(id,password))!=null)*/
		if("admin".equals(user.getEmail()) && "admin".equals(user.getPassword()))
		{
			session.setAttribute("USERID", id);
			modelandView.addObject("command", new User());
			/*if("student".equals(role))
			{
				return "redirect:en-home";
			}
			else
			{
				return "redirect:kn-home";
			}*/
			return "redirect:en-home";
			
		}
		else
		{
			bindingResult.reject("Message", "Invalid User Id or Password");
			return "redirect:login";
		}
		
	}
	
}


/*import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.vet.entity.User;


@Controller
public class UserController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public ModelAndView showForm(User user,BindingResult bindingResult, ModelAndView modelandView) {
    	if("admin".equals(user.getEmail()) && "admin".equals(user.getPassword()))
		{
			modelandView.addObject("USERID",user.getEmail());
			modelandView.setViewName("kn-home");
		}
		else
		{
			bindingResult.reject("Message", "Invalid User Id or Password");
			modelandView.setViewName("en-home");
		}
		return modelandView;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/results";
    }
}*/