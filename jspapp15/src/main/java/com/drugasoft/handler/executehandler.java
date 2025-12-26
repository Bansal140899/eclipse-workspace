package com.drugasoft.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class executehandler extends BodyTagSupport {
  Connection con;
  Statement st;
  ResultSet rs;
	   
	
	public executehandler() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ajay" ,"root"  ,"root");
			st = con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
	}
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			JspWriter out = bodyContent.getEnclosingWriter();
			String query = bodyContent.getString();
			boolean b = st.execute(query);
			
			if(b == true) {
				rs = st.getResultSet();
				ResultSetMetaData md = rs.getMetaData();
				int col_count = md.getColumnCount();
				out.println("<html><body>");
				out.println("<center><table boder ='1'>");
				out.println("<tr>");
				for(int i = 1;i<=col_count; i++) {
					out.println("<th>"+md.getColumnName(i)+"</th>");
					
				}
				out.println("</tr>");
				while(rs.next()) {
					out.println("<tr>");
					for(int i = 1;i<=col_count; i++) {
						out.println("<th>"+md.getColumnName(i)+"</th>");
						
					}
					out.println("</tr>");
				}
				
				out.println("</table></center></body></html>");
				
				
			}else {
				int rowCount = st.getUpdateCount();
				out.println("<html><body>");
				out.println("<center>");
				out.println("<h2>");
				out.println("RowCount: "+rowCount);
				out.println("</h2></center></body></html>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return SKIP_PAGE;
	}

}
