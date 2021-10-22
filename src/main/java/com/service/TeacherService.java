package com.service;

import java.util.List;

import com.dao.TeacherDao;
import com.entity.Teacher;

public class TeacherService 
{
	TeacherDao teacherDao = new TeacherDao();
	public String storeTeacherInfo(Teacher teacher)
	{
		if(teacherDao.storeTeacherRecord(teacher))
			return "Record inserted successfully!!";
		else
			return "Record didn't store";
	}
	
	public List<Teacher> getAllTeacher()
	{
		return teacherDao.getAllTeacherInfo();
	}

}
