package CookiesImplimentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie")
public class CookieClass1 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String id = req.getParameter("id");
		String customerName = req.getParameter("name");
		String product = req.getParameter("pro");
		String type = req.getParameter("type");
		
		
		System.out.println(id);
		System.out.println(customerName);
		System.out.println(product);
		System.out.println(type);
		
		String gst=null;
		String price=null;
		Cookie c1=new Cookie("id",id);
		Cookie c2=new Cookie("name",customerName);
		Cookie c3=new Cookie("product",product);
		Cookie c4=new Cookie("type",type);


		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		resp.addCookie(c4);
		
          resp.sendRedirect("cookiesclass2");
		
	}
	

}
