package com.db.Repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entityclasses.EntityManagerUtil;
import com.entityclasses.Student;
import com.entityclasses.Teacher;

public class StudentRepository implements StudentRepositoryImp
{

	@Override
	public String saveStudent(Student student)
	{
		try {
				EntityManager entityManager = EntityManagerUtil.entityManager();
		    	EntityTransaction transaction=entityManager.getTransaction();
		    	transaction.begin();
			    entityManager.persist(student);
			    transaction.commit();
			    return "data Succssfull inserted";
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return "some thing went wrong";
	}

	@Override
	public Student getStudentById(int id) 
	{
		EntityManager entityManager = EntityManagerUtil.entityManager();
		return entityManager.find(Student.class, id);
	}

	@Override
	public Student updateStudent(Student student)
	{

		try {
			EntityManager entityManager = EntityManagerUtil.entityManager();
	    	EntityTransaction transaction=entityManager.getTransaction();
	    	transaction.begin();
		   // entityManager.persist(teacher);
		    Student student1 = entityManager.merge(student);
		    transaction.commit();
		return student1;
	}catch(Exception e)
		{
		     e.printStackTrace();
		}
		return null;
	}

	@Override
	public int deleteStudent(int id)
	{
		try {
			EntityManager entityManager = EntityManagerUtil.entityManager();
	    	EntityTransaction transaction=entityManager.getTransaction();
	    	transaction.begin();
	    	entityManager.find(Teacher.class, id);
	    	transaction.begin();
	    	if(id!=0)
	    	{
	    		entityManager.remove(id);
	    	}
	    	
	    	transaction.commit();
	    	//return id;

		}catch(Exception e)
		{
			System.err.println("data not saved");
		}
		return 0;
	}

	@Override
	public List<Student> getAllStudent() 
	{

		EntityManager entityManager = EntityManagerUtil.entityManager();
		Query query = entityManager.createQuery("SELECT t FROM student_info t");
		Optional<List> optional = Optional.of(query.getResultList());
		if(optional.isPresent())
		{
			if(optional.get().size()!=0)
			{
				return optional.get();
			}
		}
		
		return null;
		}
	public Student loginByEmail(String email,String password)
	{
		EntityManager entityManager = EntityManagerUtil.entityManager();
		Query query = entityManager.createQuery("SELECT t FROM student_info t where t.email=1? AND t.password=2?");
        query.setParameter(1, email);
        query.setParameter(2,password);
        
        return (Student) query.getResultList().get(0);
	}
	
	
	
	
	public Student loginByphone(String phone,String password)
	{
		EntityManager entityManager = EntityManagerUtil.entityManager();
		Query query = entityManager.createQuery("SELECT t FROM student_info t where t.phone=1? AND t.password=2?");
        query.setParameter(1, phone);
        query.setParameter(2,password);
       
        return (Student) query.getResultList().get(0);
	}
	

}
