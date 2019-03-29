package com.prj.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.prj.web.model.MenuItem;

public class MenuItemDao {
ArrayList<MenuItem> rl=new ArrayList<MenuItem>();
	
	public ArrayList<MenuItem> getMenuItem() {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from fastfood");
		if(rs.next()) {
			while(rs.next()) {
				rl.add(new MenuItem(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
			}
		}
		else {
			rl=null;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return rl;
	}
}
