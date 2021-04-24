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

@WebServlet("/Reg")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
       
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		int Employee_ID = Integer.parseInt(req.getParameter("emp_id"));
		String Emp_name = req.getParameter("emp_name");
		String emp_addres= req.getParameter("emp_address");
		int Emp_contact =Integer.parseInt(req.getParameter("emp_contact"));
		String Dept = req.getParameter("emp_Dept");
		int Salary = Integer.parseInt(req.getParameter("emp_salary"));
		String Email_Id = req.getParameter("emp_email");
		String User_name = req.getParameter("emp_uname");
		String Password = req.getParameter("emp_password");
		
		Employee emp = new Employee();
		Dboperations d = new Dboperations();
		
		emp.setId(Employee_ID);
		emp.setName(Emp_name);
		emp.setAddress(emp_addres);
		emp.setContact(Emp_contact);
		emp.setDepartment(Dept);
		emp.setSalary(Salary);
		emp.setE_mail(Email_Id);
		emp.setUsername(User_name);
		emp.setPassword(Password);
		
		if(d.addEmployee(emp)!=0) {
			System.out.println("Employee added");
		}else {
			System.out.println("Error ! in insertion of Employee ");
		}
		RequestDispatcher rd = req.getRequestDispatcher("/EmployeeLogin.html");
		rd.forward(req, resp);
	}

}
