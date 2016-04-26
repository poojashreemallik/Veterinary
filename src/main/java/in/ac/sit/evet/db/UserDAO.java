package in.ac.sit.evet.db;

import in.ac.sit.evet.model.User;



public interface UserDAO {

	public String FindUser(User u);
	
	public int createUser(User u);

	public String login(String username, String password);
	
}
