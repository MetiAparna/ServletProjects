package com.entityclasses;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerUtil
{
	private static  EntityManager manager=null;
	private EntityManagerUtil()
	{
    }
	public static EntityManager entityManager()
	{
		if(manager==null)
		{
			 manager= Persistence.createEntityManagerFactory("aparna") .createEntityManager();
		}
		return manager;
	}
	

}
