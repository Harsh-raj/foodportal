package com.prj.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.web.dao.MonSalesDao;
import com.prj.web.model.MonSales;

/**
 * Servlet implementation class GetMonSalesController
 */
public class GetMonSalesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MonSalesDao dao = new MonSalesDao();
		ArrayList<MonSales> m1 = dao.getMonSales();
		
		request.setAttribute("Mon",m1);
		RequestDispatcher rd = request.getRequestDispatcher("showmonsales.jsp");
		rd.forward(request,response);
	}
}
