package com.ajay.factory;

import com.ajay.dao.StudentDao;
import com.ajay.dao.StudentDaoImp1;

public class StudentFactory {
	private static StudentDao studentDao;

	
	static {
		studentDao = new StudentDaoImp1();
	}
	
	public static StudentDao getStudentDao() {
		return studentDao;
	}
}
