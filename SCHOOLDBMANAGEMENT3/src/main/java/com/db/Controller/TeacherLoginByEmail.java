package com.db.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.Repository.TeacherRepository;
import com.entityclasses.Teacher;
import com.mysql.cj.Session;
@WebServlet("/teacherLogin")
public class TeacherLoginByEmail extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		TeacherRepository teacherRepository = new TeacherRepository();
        Teacher teacher = teacherRepository.loginByEmail(email, password);
		Session session=req.setAttribute(teacher, "teacher");
		if(teacher!=null)
		{
			
			resp.sendRedirect("TeacherMenu.jsp");
		}
		else
		{
			resp.sendRedirect("InvalidTeacher.jsp");
		}

		
	}

}
