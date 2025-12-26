//package com.ajaysoft.handler;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.Statement;
//
//import jakarta.servlet.jsp.JspException;
//import jakarta.servlet.jsp.JspWriter;
//import jakarta.servlet.jsp.tagext.TagSupport;
//
//public class SelectHandler extends TagSupport {
//	
//	private String table;
//	Connection con;
//	Statement st;
//	ResultSet rs;
//	
//	public SelectHandler() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ajay" ,"root"  ,"root");
//			st = con.createStatement();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public void setTable(String table) {
//		this.table = table;
//	}
//
//	@Override
//	public int doStartTag() throws JspException {
//		try {
//			JspWriter out = pageContext.getOut();
//			rs = st.executeQuery("select * from "+table);
//			ResultSetMetaData md  =rs.getMetaData();
//			int col_Count = md.getColumnCount();
//			
//			out.println("<html><body><table border='1'>");
//			out.println("<tr>");
//			for(int i=1;i<=col_Count; i++) {
//				out.println("<th>"+md.getColumnName(i)+"</th>");
//				
//			}
//			out.println("</tr>");
//			
//			while(rs.next()) {
//				out.println("</tr>");
//				for(int i=1;i<=col_Count; i++) {
//					out.println("<td>"+rs.getString(i)+"</td>");
//				}
//				out.println("</tr>");
//			}
//			out.println("</table></center></body></html>");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return SKIP_BODY;
//	}
//	
//
//}

package com.ajaysoft.handler;

import java.sql.*;
import jakarta.servlet.jsp.*;
import jakarta.servlet.jsp.tagext.TagSupport;

public class SelectHandler extends TagSupport {

    private String table;

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ajay", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + table);
            ResultSetMetaData md = rs.getMetaData();
            int colCount = md.getColumnCount();

            out.println("<html><body>");
            out.println("<table border='1'>");
            out.println("<tr>");
            for (int i = 1; i <= colCount; i++) {
                out.println("<th>" + md.getColumnName(i) + "</th>");
            }
            out.println("</tr>");

            while (rs.next()) {
                out.println("<tr>");
                for (int i = 1; i <= colCount; i++) {
                    out.println("<td>" + rs.getString(i) + "</td>");
                }
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body></html>");

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            try {
                pageContext.getOut().println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
            } catch (Exception ignored) {}
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}

