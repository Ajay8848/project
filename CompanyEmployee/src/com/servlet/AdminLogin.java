package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Admin;
import model.Dboperations;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminLogin() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("ad_uname");
		String pass = request.getParameter("ad_password");
		System.out.println(username);
		System.out.println(pass);
		Admin a = new Admin();
		Dboperations db = new Dboperations();
		if(db.validateAdmin(username, pass)){
		out.println("<h2 style='color:green'>Login Successful...!!</h2>");
			RequestDispatcher rd= request.getRequestDispatcher("/viewAdmin.jsp");
			rd.forward(request, response);
		}else{
			System.out.println("sorry email or password error");
			RequestDispatcher rd= request.getRequestDispatcher("/adminLogin.jsp");
			rd.forward(request, response);
		}
	
	}

}
