package UrlReWriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/securl2")
public class securlClass2 extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		PrintWriter out=resp.getWriter();
		out.println("ID is= "+id);
		out.println(" NAME  is= "+name);
		out.println("email is= "+email);
}
}
