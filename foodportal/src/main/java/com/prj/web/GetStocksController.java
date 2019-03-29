package com.prj.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.web.dao.StocksDao;
import com.prj.web.model.Stocks;

/**
 * Servlet implementation class GetStocksController
 */
public class GetStocksController extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				StocksDao dao = new StocksDao();
				ArrayList<Stocks> s1 = dao.getStaff();
				
				request.setAttribute("Stocks",s1);
				RequestDispatcher rd= request.getRequestDispatcher("showstocks.jsp");
				rd.forward(request,response);
	}
}
