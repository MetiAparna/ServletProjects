package com.entityclasses;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveStudent")
public class saveStudent  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student student = new Student();
		student.setName("mani");
		student.setEmail("mani@gmail.com");
		student.setPassword("abc@223");
		student.setAge(14);
		student.setAddress("hyd");
		student.setDateOfBirth(Date.valueOf(LocalDate.of(2003, 04, 01)));
		student.setStudy("10th");
		student.setSection("10A");
		student.setParent_mobile("936888778");
		student.setOverallPercentage("90%");
		
		saveStudent saveStudent = new saveStudent();
		saveStudent.
		
	}
	

}
