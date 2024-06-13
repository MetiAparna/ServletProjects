package CookiesImplimentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookis")
public class cookies1 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");

		Cookie c1=new Cookie("id",id);
		Cookie c2=new Cookie("name",name);
		Cookie c3=new Cookie("email",email);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		resp.sendRedirect("cookies2");

		
	}
   
}
