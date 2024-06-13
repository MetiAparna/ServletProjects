package com.entityclasses;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.Repository.TeacherRepository;
@WebServlet("/saveTeacher")
public class saveTeacher extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{	
		Teacher teacher=new Teacher();
		
			teacher.setName("Ravi");
			teacher.setAddress("hyd");
			teacher.setClassTeacher("10B");
			teacher.setJoiningDate( Date.valueOf(LocalDate.of(2023, 04, 01)));
			teacher.setPassword("1022");
			teacher.setPhone("9398583546");
			teacher.setQualification("MSc");
			teacher.setGender("male");
			teacher.setEmail("ravi@gmail");
			teacher.setSubject("english");
			teacher.setSalary("2.9");
			
			
			Teacher teacher1=new Teacher();
			teacher1.setId(1);
			teacher1.setName("sita");
			teacher1.setEmail("sita@gmail.com");
			teacher1.setExpiriance("3");
			teacher1.setJoiningDate(Date.valueOf(LocalDate.of(2021, 03, 02)));
			teacher1.setGender("femail");
			teacher1.setAddress("bangalure");
			teacher1.setClassTeacher("10A");
			teacher1.setPassword("1022");
			teacher1.setSubject("hindi");
			teacher1.setSalary("2.9");
			teacher1.setQualification("MCA");
			teacher1.setPhone("9398583745");






			
			TeacherRepository teacherRepository = new TeacherRepository();
			//teacherRepository.saveTeacher(teacher);
			//teacherRepository.updateTeacher(teacher1);
			//teacherRepository.deleteTeacher(3);
			teacherRepository.getTeacherById(2);
			

			}


}
