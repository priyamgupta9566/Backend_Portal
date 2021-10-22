package com.service;

import java.util.List;

import com.dao.ClassesDao;
import com.entity.Classes;

public class ClassesService 
{
	ClassesDao classesDao = new ClassesDao();
	public String storeClassesInfo(Classes classes)
	{
		if(classesDao.storeClassesRecord(classes))
			return "Record inserted successfully!!";
		else
			return "Record didn't store";
	}
	
	public List<Classes> getAllClasses()
	{
		return classesDao.getAllClassesInfo();
	}

}
