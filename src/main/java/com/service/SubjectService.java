package com.service;

import java.util.List;

import com.dao.SubjectDao;
import com.entity.Subject;

public class SubjectService 
{
	SubjectDao subjectDao = new SubjectDao();
	public String storeSubjectInfo(Subject subject)
	{
		if(subjectDao.storeSubjectRecord(subject))
			return "Record inserted successfully!!";
		else
			return "Record didn't store";
	}
	
	public List<Subject> getAllSubject()
	{
		return subjectDao.getAllSubjectInfo();
	}

}
