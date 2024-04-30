package com.dev.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.fabric.Response;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet{
	private static final long serialVersionUID=1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=req.getParameter("name");
		String upwd=req.getParameter("pass");
		String uemail=req.getParameter("email");
		String umobile=req.getParameter("contact");
		RequestDispatcher dis=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","12345");
			PreparedStatement ps=connection.prepareStatement("insert into userinfo(uname,upwd,uemail,umobile) values(?,?,?,?)");
			
			ps.setString(1, uname);
			ps.setString(2, upwd);
			ps.setString(3, uemail);
			ps.setString(4, umobile);
			
			int rowCount=ps.executeUpdate();
			dis = req.getRequestDispatcher("registration.jsp");
			
			if(rowCount>0) {
				req.setAttribute("status","success");
			}
			else {
				req.setAttribute("status","failed");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	}

