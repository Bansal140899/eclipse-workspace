package com.ajaysoft.handler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class iterater extends TagSupport {

	int count;
	private int times;
	public void setTimes(int times) {
		this.times=times;
	}
	@Override
	public int doAfterBody() throws JspException {
	
		if(count <= times) {
			count = count+1;
			return EVAL_BODY_AGAIN;
			
		}else {
			return SKIP_BODY;
		}
	}
	@Override
	public int doStartTag() throws JspException {
	
		return EVAL_BODY_INCLUDE;
	}
	
	
	
	
	
}
