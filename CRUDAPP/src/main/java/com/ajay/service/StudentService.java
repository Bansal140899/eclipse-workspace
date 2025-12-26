package com.ajay.service;

import com.ajay.beans.Student;

public interface StudentService {
	public String addStudent(Student studnet);
	public Student searchStudent(String sid);
	public String updateStudent(Student student);
	public String deleteStudent(String sid);

}
