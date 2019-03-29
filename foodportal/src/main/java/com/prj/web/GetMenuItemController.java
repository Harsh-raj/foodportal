package com.prj.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.web.dao.MenuItemDao;
import com.prj.web.model.MenuItem;

/**
 * Servlet implementation class GetMenuItemController
 */

public class GetMenuItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MenuItemDao dao = new MenuItemDao();
		ArrayList<MenuItem> m1 = dao.getMenuItem();
		
		request.setAttribute("menu",m1);
		RequestDispatcher rd= request.getRequestDispatcher("menuItem.jsp");
		rd.forward(request,response);
	}
}
