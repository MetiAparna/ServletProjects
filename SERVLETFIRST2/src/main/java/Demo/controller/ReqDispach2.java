package Demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reqDis2")
public class ReqDispach2 extends HttpServlet
{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	 {
		 System.out.println("This is dopost() for Second Servlet");
		String id= req.getParameter("id");
		 String name=req.getParameter("name");
		 String email=req.getParameter("email");
		String data=(String) req.getAttribute("data"); 
		 
		 PrintWriter out=res.getWriter();
		 res.setContentType("text/html");
		 out.write("<body bgcolor=white>");
		 out.println(id);
		 out.println(name);
		 out.println(email);
		 out.println(data);
		 out.write("</body");
		 
	 }
}
