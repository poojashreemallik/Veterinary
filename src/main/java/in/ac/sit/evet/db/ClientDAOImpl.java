package in.ac.sit.evet.db;

import in.ac.sit.evet.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
	private DBConnectionManager db;
	
	ResultSet keyset;
	public int CreateClient(Client c) {
		String sql="insert into client (fname,lname,adhaarnumber,phone,email,address) values(?,?,?,?,?,?)";
		int key=0;
		Connection conn = db.getConnection();
		
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, c.getFname());
			ps.setString(2, c.getLname());
			ps.setString(3, c.getAdhaarnumber());
			ps.setString(4, c.getPhone());
			ps.setString(5, c.getEmail());
			ps.setString(6, c.getAddress());
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
}

	

