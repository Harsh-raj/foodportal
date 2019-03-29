package com.prj.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.web.dao.StaffDao;
import com.prj.web.model.Staff;

/**
 * Servlet implementation class GetStaffController
 */
public class GetStaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				StaffDao dao = new StaffDao();
				ArrayList<Staff> s1 = dao.getStaff();
				
				request.setAttribute("Staff",s1);
				RequestDispatcher rd= request.getRequestDispatcher("showstaff.jsp");
				rd.forward(request,response);
	}
}
