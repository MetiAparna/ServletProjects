package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import Demo.controller.Student;

public class GetStudentById extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		StudentDao dao=new StudentDao();
		Student s=dao.getStudentById(id);
		PrintWriter out=res.getWriter();
		out.println(s);
		
	}

}
