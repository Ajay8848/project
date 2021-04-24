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
 * Servlet implementation class AdminReg
 */
@WebServlet("/AdminReg")
public class AdminReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminReg() {
        super();
        
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		int ID = Integer.parseInt(req.getParameter("ad_id"));
		String name = req.getParameter("ad_name");
		String address= req.getParameter("ad_address");
		int contact =Integer.parseInt(req.getParameter("ad_contact"));
		int Salary = Integer.parseInt(req.getParameter("ad_salary"));
		String Email_Id = req.getParameter("ad_email");
		String User_name = req.getParameter("ad_uname");
		String Password = req.getParameter("ad_password");
		
		Admin a = new Admin();
		Dboperations d = new Dboperations();
		
		a.setId(ID);
		a.setName(name);
		a.setAddress(address);
		a.setContact(contact);
		a.setSalary(Salary);
		a.setEmail(Email_Id);
		a.setUsername(User_name);
		a.setPassword(Password);
		
		if(d.addAdmin(a) != 0) {
			System.out.println("Admin added");
		}else {
			System.out.println("Error ! in insertion of Employee ");
		}
		RequestDispatcher rd = req.getRequestDispatcher("/adminLogin.jsp");
		rd.forward(req, resp);
	}

}
