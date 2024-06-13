package Demo.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/firstForm")
public class FirstServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
           String name=req.getParameter("name");
		   req.setAttribute("name", name.toUpperCase());
		RequestDispatcher rd=req.getRequestDispatcher("second");
		rd.forward(req, res);
	}
}
