package org.vet.db;

import org.vet.entity.User;


public interface UserDAO {
	
	public int create(User u,String password);
	public String login(String name,String password);
	

}
