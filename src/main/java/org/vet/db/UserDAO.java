package org.vet.db;

import java.util.ArrayList;

import org.vet.entity.Case;
import org.vet.entity.Client;
import org.vet.entity.Farmer;
import org.vet.entity.User;


public interface UserDAO {
	
	public void create(User u);
	public String login(String name,String password);
	
	public boolean createClient(Client client);
	public ArrayList<Client> getClientlist();
	
	public boolean createCase(Case client,int id);
	public ArrayList<Case> getCaselist();
	public ArrayList<Farmer> getCasedetails();
}
