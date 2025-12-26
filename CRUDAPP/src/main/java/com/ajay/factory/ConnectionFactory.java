package com.ajay.factory;

import java.sql.*;


public class ConnectionFactory {
	private static Connection con;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajay" ,"root"  ,"root");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() {
		return con;
	}
	
	public static void cleanup() {
		
		try {
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
