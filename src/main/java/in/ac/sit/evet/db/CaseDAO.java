package in.ac.sit.evet.db;

import java.io.File;
import java.sql.Blob;
import java.util.List;

import in.ac.sit.evet.model.Case;



public interface CaseDAO {

	public Blob img();
	//public int CreateCase(Case c,File img);
	public void CreateCase(Case c);
	
	public Case viewCase(Integer caseId);
	
	public List<Case> getAllCases();
	
	public List<Case> searchCase(int caseid);
	
	public boolean addprescription(Case c);
	
}
