package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Subject;

public class SubjectDao 
{
	SessionFactory sf;
	public SubjectDao()
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf = con.buildSessionFactory();
	}
	
	public boolean storeSubjectRecord(Subject ss)
	{
		try
		{
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(ss);
			tran.commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public List<Subject> getAllSubjectInfo()
	{
		Session session = sf.openSession();
		Query<Subject> qry = session.createQuery("select s from Subject s");
		List<Subject> listOfStd = qry.list();
		return listOfStd;
	}

}
