package SERVLETFIRST2.Demo.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
@WebServlet("/Login2")
public class Login extends HttpServlet 
{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
		{
		 String email="abc@gmail.com";
		 String password="1122";
		 String reqemail=req.getParameter("email");
		 String reqPass=req.getParameter("password");
		
		 PrintWriter out=res.getWriter();
		 
		if(reqemail.equals(email) && reqPass.equals(password))
		{
			out.println("WELCOME!!! USER");
		}else {
			out.println("invalid email or password");
		}
		out.println("doPost() executed");
		
		}	
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
				 String email="abc@gmail.com";
				 String password="1122";
				 String reqemail=req.getParameter("email");
				 String reqPass=req.getParameter("password");
				 PrintWriter out=res.getWriter();
				 
				if(reqemail.equals(email) && reqPass.equals(password)) 
				{
					out.println("WELCOME!!! USER");
				}
				else {
					out.println("invalid email or password");
					
				}
				out.println("doGet() executed");
				
	}
}



