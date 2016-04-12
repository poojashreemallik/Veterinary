package org.vet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vet.db.UserDAO;
import org.vet.entity.Case;
import org.vet.entity.Client;
import org.vet.entity.Farmer;
import org.vet.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	public void create(User s) 
	{
		 userDAO.create(s);	
	}
	/*public int create(User s, String password) 
	{
		return userDAO.create(s, password);	
	}*/
	
	public String login(String name,String password)
	{
		return userDAO.login(name, password);
	}
	
	public boolean createClient(Client c) 
	{
		return userDAO.createClient(c);	
	}
	public ArrayList<Client> getClientlist() 
	{
		return userDAO.getClientlist();	
	}
	
	public boolean createCase(Case c,int id) 
	{
		return userDAO.createCase(c,id);	
	}
	
	public ArrayList<Case> getCaselist() 
	{
		return userDAO.getCaselist();	
	}
	
	public ArrayList<Farmer> getCasedetails() 
	{
		return userDAO.getCasedetails();	
	} 
}
