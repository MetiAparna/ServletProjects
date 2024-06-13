package sessionImp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet("session2")
public class session2 extends  HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{

		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(14);
		list.add(13);
		list.add(12);
		list.add(11);
		list.add(10);
		list.add(9);
		list.add(8);
		
		HttpSession session=req.getSession();
		session.setAttribute("list",list);
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		

		
	}

}
