package com.ajay.service;

import java.sql.*;

public class UserService {
	Connection con;
	Statement st;
	ResultSet rs;
	
	String status;
	
	
	
	public UserService() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ajay" ,"root"  ,"root");
			 st= con.createStatement();
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
		
	}
	
	public String checkLogin(String uname , String upwd) {
//		String status = "";
		
	
		
		
		try {
			rs = st.executeQuery("select * from reg_Users where uname='"+uname+"' and upwd='"+upwd+"'");
			
			boolean b =  rs.next();
			
			if(b == true) {
				status = "success";
			}else {
				status = "failure";
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public String registration(String uname , String upwd , String uemail ,String umobile) {
		try {
			rs = st.executeQuery("select * from reg_Users where uname='"+uname+"'");
			
			boolean b =  rs.next();
			
			if(b == true) {
				status = "existed";
			}else {
				
				st.execute("INSERT INTO reg_users VALUES('"
		                 + uname + "','" 
		                 + upwd  + "','" 
		                 + uemail+ "','" 
		                 + umobile + "')");
				
				status = "Success";
			}
		}catch(Exception e)
		{
			status="failure";
			e.printStackTrace();
		}
		
		return status;
		
	}

}
