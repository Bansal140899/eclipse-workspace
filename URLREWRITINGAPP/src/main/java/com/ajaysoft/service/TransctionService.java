package com.ajaysoft.service;

import java.sql.*;

public class TransctionService {
	Connection con;
	Statement st;
	
	public TransctionService() throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ajay" ,"root"  ,"root");
		st = con.createStatement();
	}
  public int deposit(String accNo ,int depAmt) {
	  
	  
	  int totalAmt = 0;
	  
	  try {
		   st.executeUpdate("update account set BALANCE = BALANCE + "+depAmt+" where ACCNO = '"+accNo+"'");
		  
		  ResultSet rs  =st.executeQuery("select * from account where ACCNO = '"+accNo+"'");
		  rs.next();
		  totalAmt = rs.getInt("BALANCE");
		  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
			  
	return totalAmt;
	  
	  
	  
	  
  }
	
	
	
	
	
}
