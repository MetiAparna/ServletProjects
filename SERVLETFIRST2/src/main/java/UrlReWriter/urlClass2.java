package UrlReWriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/url2")
public class urlClass2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String k=req.getParameter("k");
		PrintWriter out=resp.getWriter();
		out.println("ID is= "+id);
		out.println(" NAME  is= "+name);
		out.println("k value is= "+k);
		
	}

}
