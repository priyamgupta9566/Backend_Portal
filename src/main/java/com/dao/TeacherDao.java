package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Teacher;

public class TeacherDao 
{
	SessionFactory sf;
	public TeacherDao()
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf = con.buildSessionFactory();
	}
	
	public boolean storeTeacherRecord(Teacher tt)
	{
		try
		{
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(tt);
			tran.commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public List<Teacher> getAllTeacherInfo()
	{
		Session session = sf.openSession();
		Query<Teacher> qry = session.createQuery("select t from Teacher t");
		List<Teacher> listOfTeacher = qry.list();
		return listOfTeacher;
	}

}
