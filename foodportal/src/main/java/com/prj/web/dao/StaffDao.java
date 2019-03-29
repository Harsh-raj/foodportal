package com.prj.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.prj.web.model.Staff;

public class StaffDao {

	ArrayList<Staff> rl=new ArrayList<Staff>();
		
		public ArrayList<Staff> getStaff() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from staff");
				while(rs.next()) {
					rl.add(new Staff(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getString(3)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rl;
	}
}
