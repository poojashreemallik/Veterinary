package in.ac.sit.evet.db;

import in.ac.sit.evet.model.Case;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class CaseDAOImpl implements CaseDAO {
	
	@Autowired
	private DBConnectionManager db;
	
	ResultSet keyset;
	/*public int CreateCase(Case c,File img) {

		String sql="insert into vet_case (description,symptoms,status,image) values(?,?,?,?)";
		int key=0;
		FileInputStream fis;
		Connection conn = db.getConnection();
		
		try
		{

			fis=new FileInputStream(img);
			System.out.println(c.getImage());
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, c.getDescription());
			ps.setString(2, c.getSymptoms());
			ps.setString(3, c.getStatus());
            ps.setBinaryStream(4,fis,(int)c.getImage().length());

			ps.executeUpdate();
			
			keyset=ps.getGeneratedKeys();
			while(keyset!=null && keyset.next())
			{
				key=keyset.getInt(1);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return key;
	}*/
	
	/*public int CreateCase(Case c) {

		String sql="insert into vet_case(description,symptoms,status,image) values(?,?,?,?)";
		int key=0;
		FileInputStream fis;
		Connection conn = db.getConnection();
		
		try
		{
			File img=c.getImage();
			fis=new FileInputStream(img);
			System.out.println(c.getImage());
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, c.getDescription());
			ps.setString(2, c.getSymptoms());
			ps.setString(3, c.getStatus());
            ps.setBinaryStream(4,fis,c.getImage().length());

			ps.executeUpdate();
			
			keyset=ps.getGeneratedKeys();
			while(keyset!=null && keyset.next())
			{
				key=keyset.getInt(1);
			}
			fis.close();
			conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return key;
	}
*/
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void CreateCase(Case c){
		
		Session session=sessionFactory.openSession();
		
		session.save(c);
		session.close();
	}
	public Case viewCase(Integer caseId) {
		String sql="select case_id,description,symptoms,status,image from vet_case where case_id=?";
		Connection conn = db.getConnection();
        Case case1 = null;
        
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, caseId);
				ResultSet rs = ps.executeQuery();
				if(rs!=null && rs.next())
				{
					
					InputStream in = rs.getBinaryStream(5);
					case1=new Case(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
					case1.setImageRawData(IOUtils.toByteArray(in));
		        }
		conn.close();
		}
		catch (SQLException e) {
			
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return case1;
	}

	public List<Case> getAllCases()
	{
		List<Case> caseList = new ArrayList<Case>();
		String sql="select case_id,description,symptoms,status,image from vet_case";
		Connection conn = db.getConnection();
		
		Case caseTemp = null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs!=null && rs.next())
			{
				
				InputStream in = rs.getBinaryStream(5);
				caseTemp = new Case(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
				caseTemp.setImageRawData(IOUtils.toByteArray(in));
				caseList.add(caseTemp);
			}
	conn.close();
	}
	catch (SQLException e) {
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
		return caseList;
}
	
	
	public Blob img()
	{
		String sql="select image from vet_case where case_id=?";
		Connection conn = db.getConnection();
		PreparedStatement ps;
		Blob blob = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,2);
			ResultSet rs = ps.executeQuery();
			while(rs!=null && rs.next())
			{
				//Case case1=new Case(rs.getBlob(1));
				blob=rs.getBlob(1);
				
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return blob;
		
	}

	public List<Case> searchCase(int caseid) {

		String sql="select case_id,description,symptoms,status from vet_case where case_id=?";
		Connection conn = db.getConnection();
        List<Case> list1=new ArrayList<Case>();
		
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, caseid);
				ResultSet rs = ps.executeQuery();
				while(rs!=null && rs.next())
				{
					Case case1=new Case(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
					list1.add(case1);
		        }
		conn.close();
		}
		catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		return list1;
	}

	@Override
	public boolean addprescription(Case c) {
		String sql="update vet_case set prescription=? where case_id=?";
		Connection conn = db.getConnection();
        int i=0;
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, c.getPrescription());
				ps.setInt(2, c.getCase_id());
				i=ps.executeUpdate();
				
		conn.close();
		}
		catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		return (i>0);
	}
	
}

	

