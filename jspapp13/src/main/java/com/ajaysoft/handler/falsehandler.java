package com.ajaysoft.handler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class falsehandler extends TagSupport {

	public int doStartTag() throws JspException {
		ifhandler ifhandler = (ifhandler)getParent();
		boolean condition = ifhandler.getCondition();
		if(condition == true) {
			return SKIP_BODY;
		}else {
			return EVAL_BODY_INCLUDE;
		}
		
	}

}
