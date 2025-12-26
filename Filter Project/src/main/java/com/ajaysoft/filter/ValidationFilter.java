//package com.ajaysoft.filter;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpFilter;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//
//@WebFilter("/reg")
//public class ValidationFilter extends HttpFilter implements Filter {
//       
//    
//    public ValidationFilter() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	
//	public void destroy() {
//		
//	}
//
//	
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		  
//		
//		
//		try {
//			response.setContentType("text/html");
//			PrintWriter out = response.getWriter();
//			
//			String uname = request.getParameter("uname");
//			String upwd = request.getParameter("upwd");
//			String uage  = request.getParameter("uage");
//			String uemail = request.getParameter("uemail");
//			String umobile = request.getParameter("umobile");
//			
//			boolean flag = true;
//			String uname_error_message=  "";
//			String upwd_error_message="";
//			String uemail_error_message ="";
//			String uage_error_message ="";
//			String umobile_error_message="";
//			
//			if(uname == null || uname.equals("")) {
//				uname_error_message = "user name is required.";
//				flag = false;
//				
//			}
//			
//			if(upwd == null || upwd.equals("")) {
//				upwd_error_message = "user password is required.";
//				flag = false;
//				
//			}
//			
//			if(uage == null || uage.equals("")) {
//				uage_error_message = "user aage is required.";
//				flag = false;
//				
//			}
//			if(uemail == null || uemail.equals("")) {
//				uemail_error_message = "user email is required.";
//				flag = false;
//				
//			}
//			if(umobile== null || umobile.equals("")) {
//				umobile_error_message = "user name is required.";
//				flag = false;
//				
//			}
//			
//			if(flag == true) {
//				chain.doFilter(request, response);
//			}
//			else {
//				
//				out.println("<html>");
//				out.println("<body>");
//				out.println("<h2 style= 'color:red;' align='center'>Ajay SoftwRE solution</h3>"); 
//				
//				out.println("<h3 style= 'color:blue;' align='center'>User registration details</h3>"); 
//				
//				
//				out.println("<form method = 'post' action='reg'>");
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				out.println("<table = align='center'>");
//				out.println("<tr>");
//				out.println("<td> Usser NAME</td>");
//				out.println("<td><input type ='text' name='uname' value='"+uname+"'/></td>");
//				out.println("<td><font color='red' size='5'>"+uname_error_message+"</font></td>");
//				out.println("</tr>");
//				
//				out.println("<tr>");
//				out.println("<td> Usser password</td>");
//				out.println("<td><input type ='text' name='upwd' value='"+upwd+"'/></td>");
//				out.println("<td><font color='red' size='5'>"+upwd_error_message+"</font></td>");
//				out.println("</tr>");
//				
//				out.println("<tr>");
//				out.println("<td> Usser age</td>");
//				out.println("<td><input type ='text' name='uage' value='"+uage+"'/></td>");
//				out.println("<td><font color='red' size='5'>"+uage_error_message+"</font></td>");
//				out.println("</tr>");
//				
//				out.println("<tr>");
//				out.println("<td> Usser email</td>");
//				out.println("<td><input type ='text' name='uemail' value='"+uemail+"'/></td>");
//				out.println("<td><font color='red' size='5'>"+uemail_error_message+"</font></td>");
//				out.println("</tr>");
//				
//				out.println("<tr>");
//				out.println("<td> Usser mobile</td>");
//				out.println("<td><input type ='text' name='umobile' value='"+umobile+"'/></td>");
//				out.println("<td><font color='red' size='5'>"+umobile_error_message+"</font></td>");
//				out.println("</tr>");
//				
//				
//				out.println("<tr><td><input type='submit' value='registartion'/></td></tr>");
//				
//				
//				
//				
//			
//				
//				out.println("</table></form></body></html>");
//				
//			} 
//			
//		}catch(Exception e) {
//		e.printStackTrace();
//			
//			
//		}
//		chain.doFilter(request, response);
//	}
//
//	
//	public void init(FilterConfig fConfig) throws ServletException {
//		// TODO Auto-generated method stub
//	}
//
//}


package com.ajaysoft.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/reg")
public class ValidationFilter extends HttpFilter implements Filter {

    public ValidationFilter() {
        super();
    }

    public void destroy() {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String uname = request.getParameter("uname");
            String upwd = request.getParameter("upwd");
            String uage = request.getParameter("uage");
            String uemail = request.getParameter("uemail");
            String umobile = request.getParameter("umobile");

            boolean flag = true;
            String uname_error_message = "";
            String upwd_error_message = "";
            String uemail_error_message = "";
            String uage_error_message = "";
            String umobile_error_message = "";

            if (uname == null || uname.equals("")) {
                uname_error_message = "User name is required.";
                flag = false;
            }
            if (upwd == null || upwd.equals("")) {
                upwd_error_message = "User password is required.";
                flag = false;
            }else {
            	
            	
            	if(upwd.length() < 6) {
            		upwd_error_message = "User password must be minimum 6 character..";
                    flag = false;
            		
            	}else if(upwd.length()>10) {
            		upwd_error_message = "User password must be maximum 10 charcter.";
                    flag = false;
            	}
            }
            if (uage == null || uage.equals("")) {
                uage_error_message = "User age is required.";
                flag = false;
            }else {
            	
            	
            	int age = Integer.parseInt(uage);
            	if(age<18 || age >25) {
            		 uage_error_message = "User age is must be in the range from 18 to 25.";
                     flag = false;
            		
            	}
            }
            if (uemail == null || uemail.equals("")) {
                uemail_error_message = "User email is required.";
                flag = false;
            }else {
            	
            	if(!uemail.endsWith("@ajaysoft.com")) {
            		 uemail_error_message = "User email is invalid.";
                     flag = false;
            	}      }
            if (umobile == null || umobile.equals("")) {
                umobile_error_message = "User mobile is required.";
                flag = false;
            }else {
            	
            	if(!umobile.startsWith("91-")) {
            		umobile_error_message = "invalid is the mobile number.";
                    flag = false;	
            	}
            }

            if (flag) {
                chain.doFilter(request, response);
            } else {

                out.println("<html>");
                out.println("<head>");
                out.println("<title>User Registration</title>");
                out.println("<style>");
                out.println("body {"
                        + "font-family: Arial, sans-serif;"
                        + "background: linear-gradient(135deg, #74ABE2, #5563DE);"
                        + "display: flex;"
                        + "justify-content: center;"
                        + "align-items: center;"
                        + "height: 100vh;"
                        + "margin: 0;"
                        + "color: #333;"
                        + "}");

                out.println(".container {"
                        + "background: white;"
                        + "padding: 30px 40px;"
                        + "border-radius: 15px;"
                        + "box-shadow: 0 10px 25px rgba(0,0,0,0.1);"
                        + "animation: slideIn 1s ease-in-out;"
                        + "}");

                out.println("@keyframes slideIn {"
                        + "from { transform: translateY(-50px); opacity: 0; }"
                        + "to { transform: translateY(0); opacity: 1; }"
                        + "}");

                out.println("h2, h3 { text-align: center; }");
                out.println("h2 { color: #e74c3c; animation: glow 1.5s infinite alternate; }");
                out.println("@keyframes glow { from { text-shadow: 0 0 5px red; } to { text-shadow: 0 0 20px orange; } }");

                out.println("table { margin: auto; }");
                out.println("input[type='text'], input[type='submit'] {"
                        + "padding: 10px;"
                        + "border-radius: 5px;"
                        + "border: 1px solid #ccc;"
                        + "transition: transform 0.3s, box-shadow 0.3s;"
                        + "}");

                out.println("input[type='text']:focus {"
                        + "transform: scale(1.05);"
                        + "box-shadow: 0 0 10px rgba(85,99,222,0.4);"
                        + "}");

                out.println("input[type='submit'] {"
                        + "background-color: #5563DE;"
                        + "color: white;"
                        + "border: none;"
                        + "cursor: pointer;"
                        + "margin-top: 10px;"
                        + "animation: pulse 2s infinite;"
                        + "}");

                out.println("@keyframes pulse {"
                        + "0% { transform: scale(1); }"
                        + "50% { transform: scale(1.05); }"
                        + "100% { transform: scale(1); }"
                        + "}");

                out.println("</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class='container'>");
                out.println("<h2>Ajay Software Solution</h2>");
                out.println("<h3>User Registration Details</h3>");

                out.println("<form method='post' action='reg'>");
                out.println("<table>");

                out.println("<tr><td>User Name</td>"
                        + "<td><input type='text' name='uname' value='" + uname + "'/></td>"
                        + "<td><font color='red'>" + uname_error_message + "</font></td></tr>");

                out.println("<tr><td>Password</td>"
                        + "<td><input type='text' name='upwd' value='" + upwd + "'/></td>"
                        + "<td><font color='red'>" + upwd_error_message + "</font></td></tr>");

                out.println("<tr><td>Age</td>"
                        + "<td><input type='text' name='uage' value='" + uage + "'/></td>"
                        + "<td><font color='red'>" + uage_error_message + "</font></td></tr>");

                out.println("<tr><td>Email</td>"
                        + "<td><input type='text' name='uemail' value='" + uemail + "'/></td>"
                        + "<td><font color='red'>" + uemail_error_message + "</font></td></tr>");

                out.println("<tr><td>Mobile</td>"
                        + "<td><input type='text' name='umobile' value='" + umobile + "'/></td>"
                        + "<td><font color='red'>" + umobile_error_message + "</font></td></tr>");

                out.println("<tr><td colspan='3' align='center'>"
                        + "<input type='submit' value='Register'/></td></tr>");

                out.println("</table>");
                out.println("</form>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(FilterConfig fConfig) throws ServletException {}

}

