



package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello-Name");
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String idcardNumber=req.getParameter("id-cardNumber");
		
        res.setContentType("text/html");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(idcardNumber);
		
		
		PrintWriter out=res.getWriter();
		out.write("<h1>Hello"+name+"</h1>");
		out.write("<h2>thank you for register"+"</h2>");
		out.write("<h2>you are id is--"+id+ "</h2>");
		out.write("<h3>please verify You are details"+"</h3>");
		out.println("<h3> idcardNumber--"+idcardNumber+"</h3>");
		out.write("<h3> you are id------"+id+"</h3>");
		out.write("<h3> you are name-----"+name+"</h3>");
		//out.write("<body bgcolor=cyan>");
		//out.write("<h3>"+id+"</h3>");

	//	out.println(id);
		//out.println(name);
		//out.println(idcardNumber);
		
	}

}
