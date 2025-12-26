package com.ajaysoft.handler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Truehandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		ifhandler ifhandler = (ifhandler)getParent();
		boolean condition = ifhandler.getCondition();
		if(condition == true) {
			return EVAL_BODY_INCLUDE;
		}else {
			return SKIP_BODY;
		}
		
	}

}
