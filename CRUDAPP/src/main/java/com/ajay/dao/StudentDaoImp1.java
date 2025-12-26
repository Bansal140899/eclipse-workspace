package com.ajay.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ajay.beans.Student;
import com.ajay.factory.ConnectionFactory;

public class StudentDaoImp1 implements StudentDao {

	@Override
	public String add(Student student) {
		
		String status = "";
		try {
			Student std = search(student.getSid());
			if(std == null) {
				Connection con = ConnectionFactory.getConnection();
				Statement st = con.createStatement();
				
				int rowCount = st.executeUpdate("insert into studentt values('"+student.getSid()+"' ,'"+student.getSname()+"' ,'"+student.getSaddr()+"')");
				if(rowCount == 1) {
					status = "success";
					
				}else {
					status = "failur";
				}
				
			}else {
				
				status = "existed";
				
			}
			
		}catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null;
		try {
			
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			
			ResultSet rs  =st.executeQuery("select * from studentt where SID = '"+sid+"'");
			boolean b  =rs.next();
			if(b==true) {
				student = new Student();
				student.setSid(rs.getString("sid"));
				student.setSname(rs.getString("sname"));
				student.setSaddr(rs.getString("saddr"));
				
			}else {
				student = null;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return student;
	}

	@Override
	public String update(Student student) {
		String status = "";
		try {
			Student std = search(student.getSid());
			if(std != null) {
				Connection con = ConnectionFactory.getConnection();
				Statement st = con.createStatement();
				
				int rowCount = st.executeUpdate(
					    "UPDATE studentt SET SNAME='" + student.getSname() + 
					    "', SADDR='" + student.getSaddr() + 
					    "' WHERE SID='" + student.getSid() + "'"
					);

				if(rowCount == 1) {
					status = "success";
					
				}else {
					status = "failur";
				}
				
			}else {
				
				status = "existed";
				
			}
			
		}catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		
		return status;
	}

		
		
		
		
		
		
		
		
		
	
	

	@Override
	public String delete(String sid) {
		String status = "";
		try {
			Student std = search(sid);
			if(std != null) {
				Connection con = ConnectionFactory.getConnection();
				Statement st = con.createStatement();
				
				int rowCount = st.executeUpdate(
					    "DELETE FROM studentt WHERE SID='" + sid + "'"
					);


				if(rowCount == 1) {
					status = "success";
					
				}else {
					status = "failur";
				}
				
			}else {
				
				status = "existed";
				
			}
			
		}catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		
		return status;
	}

}
