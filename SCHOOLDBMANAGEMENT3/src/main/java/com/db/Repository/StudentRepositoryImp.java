package com.db.Repository;

import java.util.List;

import com.entityclasses.Student;

public interface StudentRepositoryImp
{
     String saveStudent(Student student);
	
	Student getStudentById(int id);
	
	Student  updateStudent(Student student);
	
	int deleteStudent(int id);
	
	List<Student> getAllStudent();

}
