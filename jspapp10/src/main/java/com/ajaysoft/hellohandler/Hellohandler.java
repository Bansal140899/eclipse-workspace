package com.ajaysoft.hellohandler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.Tag;

public class Hellohandler implements Tag{

	
	PageContext pageContext;
	String name;
	

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("doendtag()");
		return SKIP_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		
		
		try {
			JspWriter out = pageContext.getOut();
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Hello "+name+"</h1>");
			out.println("</body></html>");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		return SKIP_BODY;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		System.out.println("getpagecontext()");
		return null;
	}

	

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
		System.out.println("setPageContext()");
		
	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("setParent()");
		
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

}
