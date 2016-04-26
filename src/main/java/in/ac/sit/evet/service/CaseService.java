package in.ac.sit.evet.service;

import in.ac.sit.evet.db.CaseDAO;
import in.ac.sit.evet.model.Case;

import java.io.File;
import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CaseService {

	@Autowired
	CaseDAO dao;
	
	public Blob img()
	{
		return dao.img();
	}
	/*public int createCase(Case c,File img)
	{
		return dao.CreateCase(c,img);
	}*/
	
	public void createCase(Case c)
	{
		 dao.CreateCase(c);
	}
	public Case viewCase(Integer caseId)
	{
		return dao.viewCase(caseId);
	}

	public List<Case> viewAllCases()
	{
		return dao.getAllCases();
	}
	
	
	public List<Case> searchCase(int caseid)
	{
		return dao.searchCase(caseid);
	}
	
	public boolean addprescription(Case c)
	{
		return dao.addprescription(c);
	}
}
