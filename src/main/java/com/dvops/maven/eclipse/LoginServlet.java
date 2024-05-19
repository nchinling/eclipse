package com.dvops.maven.eclipse;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Step 1: retrieve parameter yourName from the request from the web form
		String username = request.getParameter("username"); 
		String password = request.getParameter("password"); //Step 2: Initialize a PrintWriter object to return the html values via the response
		PrintWriter writer = response.getWriter();
		 if ("nchinling".equals(username) && "nice".equals(password)) {
		        writer.println("<h1>You have successfully logged in.</h1>");
		    } else {
		        writer.println("<h1>Wrong credentials.</h1>");
		    }
//		writer.println("<h1>Hello " + username + "</h1>");
//		writer.println("<h1>Password " + password + "</h1>");
		writer.close();
		doGet(request, response);
	}

}
