package in.ac.sit.evet.service;

import in.ac.sit.evet.db.ClientDAO;
import in.ac.sit.evet.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

	@Autowired
	ClientDAO dao;
	
	public int createclient(Client c)
	{
		return dao.CreateClient(c);
	}
}
