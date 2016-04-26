package in.ac.sit.evet.db;

import in.ac.sit.evet.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class UserDAOImpl implements UserDAO{
	
	private static final String sql="select role from user where username=? and password=?";
	
	@Autowired
	private DBConnectionManager db;
	
	public String FindUser(User u)
	{
		
		String role=null;
		String sql="select role,username from user where username=? and password=?";
		Connection conn = db.getConnection();
		
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.execute();
			
			ResultSet rs=ps.executeQuery();
			while(rs!=null && rs.next())
			{
				role=rs.getString(1);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return role;
	}
	
	
	public int createUser(User u)
	{
		ResultSet keyset;
		String sql="insert into user (username,password,role) values(?,?,?)";
		int key=0;
		Connection conn = db.getConnection();
		
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, "doctor");
			ps.executeUpdate();
					
			keyset=ps.getGeneratedKeys();
			while(keyset!=null && keyset.next())
			{
				key=keyset.getInt(1);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return key;
	}


	@Override
	public String login(String username, String password) {
		Connection conn=db.getConnection();
		ResultSet rs=null;
		String role=null;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
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
		return role;	}
}
