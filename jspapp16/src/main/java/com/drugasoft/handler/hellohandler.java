package com.drugasoft.handler;

import java.io.IOException;

import jakarta.servlet.jsp.JspContext;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class hellohandler extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		
		
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		out.println("<h1>hello user !</h1>");
		
	}

}
