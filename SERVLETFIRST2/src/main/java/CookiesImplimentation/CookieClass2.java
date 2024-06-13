package CookiesImplimentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookiesclass2")
public class CookieClass2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Cookie c1=new Cookie("gst","18%");
		Cookie c2=new Cookie("price","inINR");

		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.sendRedirect("cookiesClass3");
		
		
		
	
	
	}

}
