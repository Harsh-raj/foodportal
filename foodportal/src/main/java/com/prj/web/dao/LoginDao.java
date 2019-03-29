package com.prj.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.prj.web.model.Login;

public class LoginDao {
	ArrayList<Login> rl=new ArrayList<Login>();
	
	public ArrayList<Login> getLogin(Boolean Lid, String lname, String lpass) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","");
		Statement st = con.createStatement();
		if(Lid==false) {
		ResultSet rs = st.executeQuery("select * from customer where Fname = '"+lname+"' and Mobileno = '"+lpass+"'");
		while(rs.next()) {
			rl.add(new Login(Lid,rs.getString("Fname"),rs.getString("Mobileno")));
		}
		}
		else {
			ResultSet rs = st.executeQuery("select * from admin where Username = '"+lname+"' and Pwd = '"+lpass+"'");
			while(rs.next()) {
				rl.add(new Login(Lid,rs.getString("Username"),rs.getString("Pwd")));
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return rl;
	}
}
