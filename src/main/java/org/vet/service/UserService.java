package org.vet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vet.db.UserDAO;
import org.vet.entity.User;

@Service
public class UserService {

	@Autowired
	UserDAO userDAO;
	
	public int create(User s, String password) 
	{
		return userDAO.create(s, password);	
	}
	
	public String login(String name,String password)
	{
		return userDAO.login(name, password);
	}
	
	

}
