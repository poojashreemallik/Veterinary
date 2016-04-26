package in.ac.sit.evet.db;

import in.ac.sit.evet.model.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class DoctorDAOImpl implements DoctorDAO{

	@Autowired
	private DBConnectionManager db;
	
	ResultSet keyset;
	public int createDoctor(Doctor d) {
		String sql1="insert into user(username,password,role) values(?,?,?)";
		String sql="insert into doctor_profile(fname,lname,gender,dob,adhaarnumber,phone,address,specialization) values(?,?,?,?,?,?,?,?)";
		int key=0;
		Connection conn = db.getConnection();
		
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, d.getFname());
			ps.setString(2, d.getLname());
			ps.setString(3, d.getGender());
			ps.setString(4, d.getDob());
			ps.setString(5, d.getAdhaarnumber());
			ps.setString(6, d.getPhone());
			ps.setString(7, d.getAddress());
			ps.setString(8, d.getSpecialization());
			ps.executeUpdate();
			
			keyset=ps.getGeneratedKeys();
			while(keyset!=null && keyset.next())
			{
				key=keyset.getInt(1);
			}
			
			PreparedStatement ps1=conn.prepareStatement(sql1);
			ps1.setString(1, d.getUser().getUsername());
			ps1.setString(2, d.getUser().getPassword());
			ps1.setString(3, "doctor");
			ps1.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return key;
	}

	public List<Doctor> viewDoctor() {
		String sql="select doc_id,fname,adhaarnumber,phone,specialization from doctor_profile";
		Connection conn = db.getConnection();
        List<Doctor> list1=new ArrayList<Doctor>();
		
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs!=null && rs.next())
				{
					Doctor doc=new Doctor(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5));
					list1.add(doc);
		        }
		conn.close();
		}
		catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		return list1;
	}
}

