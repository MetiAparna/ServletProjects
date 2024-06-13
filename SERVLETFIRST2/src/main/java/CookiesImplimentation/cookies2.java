package CookiesImplimentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookies2")
public class cookies2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Cookie[] coo=req.getCookies();
		String id=null;
		String name=null;
		String email=null;
		
		for(Cookie c:coo)
		{
			if(c.getName().equals("id"))
			{
				 id = c.getValue();
			}
			if(c.getName().equals("name"))
			{
				 name = c.getValue();
			}
			if(c.getName().equals("email"))
			{
			      email = c.getValue();
			}
		}
		PrintWriter out = resp.getWriter();
		out.println("ID is = "+id);
		out.println("NAME IS= "+name);
		out.println("EMAIL IS="+email);

		
		
	}

}
