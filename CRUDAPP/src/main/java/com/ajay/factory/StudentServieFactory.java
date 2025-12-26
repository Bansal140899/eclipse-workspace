package com.ajay.factory;

import com.ajay.service.StudentService;
import com.ajay.service.StudentServiceImp;

public class StudentServieFactory {
	private static StudentService studentService;
	static {
		studentService = new StudentServiceImp();
	}
	
	public static StudentService getStudentService() {
		return studentService;
	}

}
