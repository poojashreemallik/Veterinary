package org.vet.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.vet.entity.Case;
import org.vet.entity.Client;
import org.vet.entity.Farmer;
import org.vet.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private static final String sql="select role from user where username=? and password=?";
	private static final String GETCLIENTSLIST_SQL="select client_id,farmername from client";
	private static String CREATE_SQL="insert into user_profile(fname,lname,gender,dob," +
			                         "adharnumber,phone,address,email,specialization) values(?,?,?,?,?,?,?,?,?)";
	private static String USER_SQL="insert into user(username,password,role) values(?,?,?)";
	private static String CREATECLIENT_SQL="insert into client(farmername,adhaarnumber,phone,address,email) values(?,?,?,?,?)";
	private static String CREATECASE_SQL="insert into vet_case(description,symptoms,status,client_id) values(?,?,?,?)";
	private static final String GETCASELIST_SQL="select case_id,status from vet_case";
	
	@Autowired
	private DBConnectionManager dbconnectionManager;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl() {
			
		}
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void create(User u)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(u);
	}
	
	
	/*public int create(User u,String password)
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
	}*/
			

	



	
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

	@Override
	public boolean createClient(Client c) {
		
		Connection conn=dbconnectionManager.getConnection();
		int i=0;
		
		
			
			try {
				PreparedStatement ps=conn.prepareStatement(CREATECLIENT_SQL);
				ps.setString(1, c.getFarmerName());
				ps.setString(2, c.getAdhaarnumber());
				ps.setString(3, c.getPhone());
				ps.setString(4, c.getAddress());
				ps.setString(5, c.getEmail());
				i=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return (i>0);
	}


	@Override
	public ArrayList<Client> getClientlist() {
		Connection conn=dbconnectionManager.getConnection();
		ResultSet rs;
		ArrayList<Client> list=new ArrayList<Client>();	
				try {
					PreparedStatement ps=conn.prepareStatement(GETCLIENTSLIST_SQL);
					rs=ps.executeQuery();
					while(rs!=null && rs.next())
					{
						int id=rs.getInt(1);
						String name=rs.getString(2);
						Client c=new Client(id, name);
						list.add(c);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(list);
		return list;
	}


	@Override
	public boolean createCase(Case c,int id) {
		
		Connection conn=dbconnectionManager.getConnection();
		int i=0;
		
		
			
			try {
				PreparedStatement ps=conn.prepareStatement(CREATECASE_SQL);
				ps.setString(1, c.getDescription());
				ps.setString(2, c.getSymptoms());
				ps.setString(3, "new");
				ps.setInt(4, id);
				i=ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return (i>0);
	}


	@Override
	public ArrayList<Case> getCaselist() {
		
		Connection conn=dbconnectionManager.getConnection();
		ResultSet rs;
		ArrayList<Case> list=new ArrayList<Case>();	
				try {
					PreparedStatement ps=conn.prepareStatement(GETCASELIST_SQL);
					rs=ps.executeQuery();
					while(rs!=null && rs.next())
					{
						int id=rs.getInt(1);
						String status=rs.getString(2);
						Case c=new Case(id, status);
						list.add(c);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(list);
		return list;
	}


	@Override
	public ArrayList<Farmer> getCasedetails() {
		Connection conn=dbconnectionManager.getConnection();
		ResultSet rs;
		/*ArrayList<Farmer> list=new ArrayList<Farmer>();	
				try {
					PreparedStatement ps=conn.prepareStatement(GETCASEDETAILS_SQL);
					rs=ps.executeQuery();
					while(rs!=null && rs.next())
					{
						int id=rs.getInt(1);
						String status=rs.getString(2);
						Case c=new Case(id, status);
						list.add(c);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(list);*/
		return null;
	}

}
