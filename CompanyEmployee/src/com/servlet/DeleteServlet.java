package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import model.Dboperations;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("html/text");
		
		int emp_id = Integer.parseInt(request.getParameter("emp_id"));
		
		Employee e = new Employee();
		Dboperations db = new Dboperations();
		
		if(db.deleteEmpById(emp_id) !=0) {
			response.sendRedirect("EmployeeLogin.html");
		}
		else {
			System.out.println("Error in Deleting employee");
		}
		
	}

}
