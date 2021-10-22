package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Classes;
import com.entity.Login;

public class ClassesDao 
{
	SessionFactory sf;
	public ClassesDao()
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf = con.buildSessionFactory();
	}
	
//	public boolean Validate(int id)
//	{
//		Session session = sf.openSession();
//		Query<Integer> qry = session.createQuery("select obj from Subject obj where obj.sid=:a");
//		qry.setParameter("a", id);
//		List<Integer> list = qry.list();
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			if(itr.next()==id)
//				return true;
//		}
//		return false;	
//	}
	
	public boolean storeClassesRecord(Classes cc)
	{
		try
		{
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(cc);
			tran.commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public List<Classes> getAllClassesInfo()
	{
		Session session = sf.openSession();
		Query<Classes> qry = session.createQuery("select c from Classes c");
		List<Classes> listOfClass = qry.list();
		return listOfClass;
	}

}
