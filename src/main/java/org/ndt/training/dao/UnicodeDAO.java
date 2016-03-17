package org.ndt.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.ndt.training.entity.Unicode;


public class UnicodeDAO {
	
	private static final String sql="insert into testmessage(message) values(?)";
	private static final String sql1="select message from testmessage";
	
	public static boolean create(String string)
	{
		Connection conn=DBConnectionManager.getConnection();
		int row=0;
		try {
			System.out.println(string);
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, string);
			row=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (row>0);
	}
	
	
	
	public static ArrayList<Unicode> getList() {
		Connection conn=DBConnectionManager.getConnection();
		ResultSet rs=null;
		PreparedStatement ps;
		
		ArrayList<Unicode> list=null;
			try
			{
				list=new ArrayList<Unicode>();
				ps=conn.prepareStatement(sql1);
				rs=ps.executeQuery();
				while(rs!=null && rs.next())
				{
					String uni=rs.getString(1);
					
					Unicode u=new Unicode(uni);
					System.out.println(u.getComment());
					list.add(u);
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}
	
	/*public static ArrayList<String> getList() {
		Connection conn=DBConnectionManager.getConnection();
		ResultSet rs=null;
		PreparedStatement ps;
		
		ArrayList<String> list=null;
			try
			{
				list=new ArrayList<String>();
				ps=conn.prepareStatement(sql1);
				rs=ps.executeQuery();
				while(rs!=null && rs.next())
				{
					String uni=rs.getString(1); 
					//Unicode u=new Unicode(uni);
					list.add(uni);
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}*/
}
