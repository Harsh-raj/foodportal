package com.prj.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.prj.web.model.Discounts;

public class DiscountsDao {
	ArrayList<Discounts> rl=new ArrayList<Discounts>();

		public ArrayList<Discounts> getDiscounts() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from discount");
				while(rs.next()) {
					
					rl.add(new Discounts(Integer.parseInt(rs.getString(1)),Integer.parseInt(rs.getString(2))));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rl;
		}
}