package Demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class SecondServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	
		PrintWriter out=res.getWriter();
		String name=(String)req.getAttribute("name");
		String id=req.getParameter("id");
		String email=req.getParameter("email");
		
		out.println("Hi "+name);
		out.println("you are id is "+id);
		out.println("you are email is "+email);

	}
	

}
