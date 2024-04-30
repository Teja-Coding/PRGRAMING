package cn.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.User;

import cn.connection.DbConn;
import cn.dao.UserDeo;
import cn.dao.*;
@WebServlet("/LoginServlets")
public class LoginServlets extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out=response.getWriter()){
			 String email=request.getParameter("login-email");
			 String password=request.getParameter("login-password");
			 try {
				 
				 UserDeo udeo=new UserDeo(DbConn.getConnection());
				 
				 cn.model.User user=udeo.userlogin(email,password);
				 if(user != null) {
					 out.print("user login");
				 }
				 else {
					 out.print("user login failed");
				 }
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
		}
	}
}