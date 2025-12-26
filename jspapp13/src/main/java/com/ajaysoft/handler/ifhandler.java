package com.ajaysoft.handler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class ifhandler extends TagSupport {

	private boolean condition;
	
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	public boolean getCondition() {
		return condition;
	}
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE;
	}


}
