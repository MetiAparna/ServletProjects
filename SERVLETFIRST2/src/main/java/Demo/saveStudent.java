package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import Demo.controller.Student;

public class saveStudent extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
         int id=Integer.parseInt(req.getParameter("id"));
         String name=req.getParameter("name");
         String email=req.getParameter("email");
         String idcardNum=req.getParameter("idcardNumber");
         
         System.out.println(id);
         System.out.println(name);
         System.out.println(email);
         System.out.println(idcardNum);
         
          PrintWriter out=res.getWriter();
          out.println("id-"+id);
          out.println("name-"+name);
          out.println("email-"+email);
          out.println("idcardNum-"+idcardNum);
         
         Student s=new Student();
         s.setId(id);
         s.setName(name);
         s.setEmail(email);
         s.setIdCardNumber(idcardNum);
         
         StudentDao dao=new StudentDao();
         res.getWriter().write(dao.saveStudent(s));

	}

}
