package in.ac.sit.evet.controller;

import in.ac.sit.evet.model.Client;
import in.ac.sit.evet.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CreateClientController {
	
	@Autowired
	ClientService clientService;

	@RequestMapping(value="/createclient",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		
		System.out.println("Inside GET Method of User Controller");
		return new ModelAndView("createclient","command",new Client());
		
	}
	
	@RequestMapping(value="/createclient",method=RequestMethod.POST)
	public String createUser(@ModelAttribute("client")Client s)
	{
		System.out.println("Inside POST METHOD of user Controller");
		System.out.println(s);
		clientService.createclient(s);
		return "redirect:createclient";
	}
}
