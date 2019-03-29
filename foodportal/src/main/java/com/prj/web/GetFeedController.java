package com.prj.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prj.web.dao.FeedDao;
import com.prj.web.model.Feed;

/**
 * Servlet implementation class GetFeedController
 */
public class GetFeedController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				FeedDao dao = new FeedDao();
				ArrayList<Feed> m1 = dao.getFeed();
				
				request.setAttribute("feed",m1);
				RequestDispatcher rd= request.getRequestDispatcher("feedback.jsp");
				rd.forward(request,response);
	}
}
