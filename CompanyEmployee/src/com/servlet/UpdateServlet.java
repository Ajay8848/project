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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/Update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("emp_id"));
		String name = request.getParameter("emp_name");
		String address = request.getParameter("emp_address");
		int contact = Integer.parseInt(request.getParameter("emp_contact"));
		String Dept = request.getParameter("emp_Dept");
		int Salary = Integer.parseInt(request.getParameter("emp_salary"));
		String Email = request.getParameter("emp_email");
		String UserName = request.getParameter("emp_uname");
		String pass = request.getParameter("emp_password");
		Employee e = new Employee(id,Salary,contact,name,address,Dept,Email,UserName,pass);
		Dboperations db = new Dboperations();

		if(db.updateEmployeeById(e)!=0){
			
			 Employee ed =	db.getEmployeeById(id);
			 RequestDispatcher rd = request.getRequestDispatcher("empByID.jsp");
			 request.setAttribute("employ", ed);
			 rd.include(request, response);
		}else
		{
			System.out.println("Error while updation");
		}
	}

}
