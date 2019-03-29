package com.prj.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.prj.web.model.MonSales;

public class MonSalesDao {
	ArrayList<MonSales> rl=new ArrayList<MonSales>();
	
	public ArrayList<MonSales> getMonSales() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from monsales");
			while(rs.next()) {
				rl.add(new MonSales(Integer.parseInt(rs.getString(1)),Long.parseLong(rs.getString(2)),rs.getString(3),Integer.parseInt(rs.getString(4))));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rl;
	}
}
