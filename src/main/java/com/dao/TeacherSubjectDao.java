package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.TeacherSubject;

public class TeacherSubjectDao 
{
	SessionFactory sf;
	public TeacherSubjectDao()
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf = con.buildSessionFactory();
	}
	
	public boolean storeTeacherSubjectRecord(TeacherSubject ts)
	{
		try
		{
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(ts);
			tran.commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public List<TeacherSubject> getAllTeacherSubjectInfo()
	{
		Session session = sf.openSession();
		Query<TeacherSubject> qry = session.createQuery("select ts from TeacherSubject ts");
		List<TeacherSubject> listOfTeacherSubject = qry.list();
		return listOfTeacherSubject;
	}


}
