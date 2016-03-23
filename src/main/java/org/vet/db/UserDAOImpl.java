package org.vet.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vet.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private static final String sql="select role from user where username=? and password=?";

	private static String CREATE_SQL="insert into user_profile(fname,lname,gender,dob," +
			                         "adharnumber,phone,address,email,specialization) values(?,?,?,?,?,?,?,?,?)";
	private static String USER_SQL="insert into user(username,password,role) values(?,?,?)";
	
	
	@Autowired
	private DBConnectionManager dbconnectionManager;
	
	public int create(User u,String password)
	{
		Connection conn=dbconnectionManager.getConnection();
		int i=0,n=0,key=0;
		ResultSet keys;
		
		try 
		{
			
			PreparedStatement ps=conn.prepareStatement(CREATE_SQL);
			ps.setString(1, u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getGender());
			ps.setString(4, u.getDob());
			ps.setString(5, u.getAdhaarno());
			ps.setString(6, u.getPhone());
			ps.setString(7, u.getAddress());
			ps.setString(8, u.getEmail());
			ps.setString(9, u.getSpecialization());
			
			
			i=ps.executeUpdate();
			keys=ps.getGeneratedKeys();
			while(keys!=null && keys.next())
			{
				key=keys.getInt(1);
			}
			
			PreparedStatement ps1=conn.prepareStatement(USER_SQL);
			ps1.setString(1, u.getEmail());
			ps1.setString(2, password);
			ps1.setString(3, "doctor");
			n=ps1.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		finally
		{
			try
			{
				conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return key;
	}
			

	



	
	@Override
	public String login(String name, String password) {
		Connection conn=dbconnectionManager.getConnection();
		ResultSet rs=null;
		String role=null;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs!=null && rs.next())
			{
				role=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return role;
	}



}
