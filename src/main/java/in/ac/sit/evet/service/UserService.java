package in.ac.sit.evet.service;

import in.ac.sit.evet.db.UserDAO;
import in.ac.sit.evet.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	UserDAO dao;

	public String FindUser(User u)
	{
		return dao.FindUser(u);
	}
	public int createUser(User u)
	{
		return dao.createUser(u);
	}
	public String login(String username,String password)
	{
		return dao.login(username, password);
	}
}
