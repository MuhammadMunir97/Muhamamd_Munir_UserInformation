package com.userinformation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    
    }
    
    public String changeToUnknown(String value) {
    	if ( value == null) {
    		value = "unknown";
    	}
    	return value;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName")  ;
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		String homeTown = request.getParameter("homeTown");
		
		 
	
		
		firstName = changeToUnknown(firstName);
		lastName = changeToUnknown(lastName);
		favoriteLanguage = changeToUnknown(favoriteLanguage);
		homeTown = changeToUnknown(homeTown);
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1> Welcome, " + firstName +" " + lastName + "</h1>");
		out.write("<h3> Your favorite language is: " + favoriteLanguage + "</h3>");
		out.write("<h3> Your hometown is: " + homeTown  + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
