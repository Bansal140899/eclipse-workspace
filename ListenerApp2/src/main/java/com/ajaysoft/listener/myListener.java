package com.ajaysoft.listener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class myListener implements ServletRequestAttributeListener {

   
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	
    	System.out.println("Attribute removed ["+srae.getName()+","+srae.getValue()+"]");
    }

	
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	System.out.println("attribute replaced ["+srae.getName()+","+srae.getValue()+"]");
    	
    }

	
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	System.out.println("attribute addes ["+srae.getName()+","+srae.getValue()+"]");
    	
    	
    	
    }
	
}
