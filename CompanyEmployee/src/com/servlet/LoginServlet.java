package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import model.Dboperations;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
       
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("emp_uname");
		String pass = request.getParameter("emp_password");
		System.out.println(username);
		System.out.println(pass);
		Employee e = new Employee();
		Dboperations db = new Dboperations();
		if(db.validate(username, pass)){
		out.println("<h2 style='color:green'>Login Successful...!!</h2>");
			RequestDispatcher rd= request.getRequestDispatcher("/viewEmployee.jsp");
			rd.forward(request, response);
		}else{
			System.out.println("sorry email or password error");
			RequestDispatcher rd= request.getRequestDispatcher("/EmployeeLogin.jsp");
			rd.forward(request, response);
		}
	}

}
