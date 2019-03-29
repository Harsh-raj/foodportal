package com.prj.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.web.dao.DiscountsDao;
import com.prj.web.model.Discounts;

/**
 * Servlet implementation class GetDiscountsController
 */
public class GetDiscountsController extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				DiscountsDao dao = new DiscountsDao();
				ArrayList<Discounts> s1 = dao.getDiscounts();
				
				request.setAttribute("Discount",s1);
				RequestDispatcher rd= request.getRequestDispatcher("showDiscounts.jsp");
				rd.forward(request,response);
	}

}
