package com.ajay.studentdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ajay.user.StudentServiceImp1;

public class StudentDao {
	Connection con;
	Statement st;
	ResultSet rs;
	
	ArrayList<StudentServiceImp1>al;
	
	public StudentDao() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ajay" ,"root"  ,"root");
				 st= con.createStatement();
				 al = new ArrayList<StudentServiceImp1>();
				 }
			catch(Exception e) {
					 e.printStackTrace();
				 }
			
		
	}
	
	public void addd(StudentServiceImp1 std) {
		try {
			
			st.executeUpdate("INSERT INTO studentt VALUES('" +std.getSid()+ "', '" + std.getSname() + "', '" + std.getSaddr() + "')");

			
		}catch(Exception e) {
			e.printStackTrace();		}
	}
	
	public ArrayList<StudentServiceImp1> getStudentDetails() throws SQLException{
		
		
		rs = st.executeQuery("select * from studentt");
		
		while(rs.next()) {
			StudentServiceImp1 st = new StudentServiceImp1();
			st.setSid(rs.getString(1));
			st.setSname(rs.getString(2));
			st.setSaddr(rs.getString(3));
			
			al.add(st);
		}
		
		return al;
		
	}

}
