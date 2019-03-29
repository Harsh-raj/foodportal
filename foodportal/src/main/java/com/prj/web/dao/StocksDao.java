package com.prj.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.prj.web.model.Stocks;

public class StocksDao {
	ArrayList<Stocks> rl=new ArrayList<Stocks>();
	
	public ArrayList<Stocks> getStaff() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from stock");
			while(rs.next()) {
				rl.add(new Stocks(Integer.parseInt(rs.getString(1)),rs.getString(2),Integer.parseInt(rs.getString(3))));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return rl;
}
}
