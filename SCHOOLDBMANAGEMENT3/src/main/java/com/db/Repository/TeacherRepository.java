package com.db.Repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.entityclasses.EntityManagerUtil;
import com.entityclasses.Teacher;
public class TeacherRepository implements TeacherRepositoryImp
{
	@Override
	public String saveTeacher(Teacher teacher)
	{
		try {
			EntityManager entityManager = EntityManagerUtil.entityManager();
	    	EntityTransaction transaction=entityManager.getTransaction();
	    	transaction.begin();
		    entityManager.persist(teacher);
		    transaction.commit();
		    return "data Succssfull inserted";
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return "some thing went wrong";
		
	}
	
	
	
	@Override
	public Teacher getTeacherById(int id)
	{
		EntityManager entityManager = EntityManagerUtil.entityManager();
		return entityManager.find(Teacher.class, id);
	}
	
	
	
	
	@Override
	public Teacher updateTeacher(Teacher teacher)
	{
		try {
			EntityManager entityManager = EntityManagerUtil.entityManager();
	    	EntityTransaction transaction=entityManager.getTransaction();
	    	transaction.begin();
		   // entityManager.persist(teacher);
		    Teacher teacher2 = entityManager.merge(teacher);
		    transaction.commit();
		return teacher2;
	}catch(Exception e)
		{
		     e.printStackTrace();
		}
		return null;

     }
	
	
	
	@Override
	public int deleteTeacher(int id)
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
	    	else
	    	{
	    		return 0;
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
	public List<Teacher> getAllteacher() 
	{
		EntityManager entityManager = EntityManagerUtil.entityManager();
		Query query = entityManager.createQuery("SELECT t FROM teacher t");
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
	
	
	
	public Teacher loginByEmail(String email,String password)
	{
		EntityManager entityManager = EntityManagerUtil.entityManager();
		Query query = entityManager.createQuery("SELECT t FROM teacher_info t where t.email=?1 AND t.password=?2");
        query.setParameter(1, email);
        query.setParameter(2,password);
        
       // return (Teacher) query.getResultList().get(0);
        List list = query.getResultList();
        if(list.size()!=0)
        {
        	return (Teacher) list.get(0);
        }
        else
        {
        	return null;
        }
	}
	
	
	
	
	public Teacher loginByphone(String phone,String password)
	{
		EntityManager entityManager = EntityManagerUtil.entityManager();
		Query query = entityManager.createQuery("SELECT t FROM teacher_info t where t.phone=1? AND t.password=2?");
        query.setParameter(1, phone);
        query.setParameter(2,password);
       
        return (Teacher) query.getResultList().get(0);
	}
	
}
