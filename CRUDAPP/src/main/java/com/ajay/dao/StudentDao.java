package com.ajay.dao;

import com.ajay.beans.Student;

public interface StudentDao {

	public String add(Student student);
	public Student search(String sid);
	public String update(Student student);
	public String delete(String sid);
}
