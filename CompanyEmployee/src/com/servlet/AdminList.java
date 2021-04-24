package com.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dboperations;

/**
 * Servlet implementation class AdminList
 */
@WebServlet("/AdminList")
public class AdminList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AdminList() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dboperations db = new Dboperations();
		Connection con=db.getConnection();
		
		db.getAdminList();
	}

}
