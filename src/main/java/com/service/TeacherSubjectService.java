package com.service;

import java.util.List;

import com.dao.TeacherSubjectDao;
import com.entity.TeacherSubject;


public class TeacherSubjectService 
{
	TeacherSubjectDao teacherSubjectDao = new TeacherSubjectDao();
	public String storeTeacherSubjectInfo(TeacherSubject ts)
	{
		if(teacherSubjectDao.storeTeacherSubjectRecord(ts))
			return "Record assigned successfully!!";
		else
			return "Record didn't asssigned";
	}
	
	public List<TeacherSubject> getAllTeacherSubjectInfo()
	{
		return teacherSubjectDao.getAllTeacherSubjectInfo();
	}

}
