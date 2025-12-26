package com.ajaysoft.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ajaysoft.beans.Student;

public class StudentService {
	Connection con;
	Statement st;
	ResultSet rs;
	Student sto;
	
	String status;
	
	
	public StudentService () {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ajay" ,"root"  ,"root");
			 st= con.createStatement();
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
		
		
	}

	public Student getStudent(String sid) {
		try {
			
			rs = st.executeQuery("select * from studen where sid = '"+sid+"'");
			boolean b = rs.next();
			if(b==true) {
				sto = new Student();
				sto.setSid(rs.getString(1));
				sto.setSname(rs.getString(2));
				sto.setSaddr(rs.getString(3));
				
				
			}else {
				sto=null;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return sto;
		
	}
	
	
	public String update(Student std) {
		String status = "";
		
		try {
			int rowcount = st.executeUpdate("update studen set sname = '"+std.getSname()+"' ,saddr='"+std.getSaddr()+"' where sid = '"+std.getSid()+"'");
			
			if(rowcount == 1) {
				status = "success";
				
			}else {
				status = "failure";
			}
			
			
		}catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
