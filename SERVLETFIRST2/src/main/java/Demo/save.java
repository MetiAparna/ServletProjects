package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.catalina.connector.Response;

public class save extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
		
		res.setContentType("text/html");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		
		PrintWriter out=res.getWriter();
		out.write("<body bgcolor=pink>");
		out.println("<h1>"+id+"</h1>");
		
		out.println(id);
		out.println(name);
		out.println(email);
		out.println(age);

//this medthod is used to modifythe content type of Response by default content type is text.


		
	}

}
