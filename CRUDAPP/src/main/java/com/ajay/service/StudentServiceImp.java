package com.ajay.service;

import com.ajay.beans.Student;
import com.ajay.dao.StudentDao;
import com.ajay.factory.StudentFactory;

public class StudentServiceImp implements StudentService {

	@Override
	public String addStudent(Student studnet) {
		
		
		StudentDao studentDao = StudentFactory.getStudentDao();
		String status = studentDao.add(studnet);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
	
		
		StudentDao studentDao = StudentFactory.getStudentDao();
		Student student = studentDao.search(sid);
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		
		StudentDao studentDao = StudentFactory.getStudentDao();
		String status = studentDao.update(student);
		return status;
		
		
		
	}

	@Override
	public String deleteStudent(String sid) {
		StudentDao studentDao = StudentFactory.getStudentDao();
		String status = studentDao.delete(sid);
		return status;
	}

}
