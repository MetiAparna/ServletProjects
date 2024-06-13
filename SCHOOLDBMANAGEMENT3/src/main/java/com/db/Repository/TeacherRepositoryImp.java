package com.db.Repository;

import java.util.List;

import com.entityclasses.Teacher;

public interface TeacherRepositoryImp 
{
	String saveTeacher(Teacher teacher);
	
	Teacher getTeacherById(int id);
	
	Teacher updateTeacher(Teacher teacher);
	
	int deleteTeacher(int id);
	
	List<Teacher> getAllteacher();

	

}
