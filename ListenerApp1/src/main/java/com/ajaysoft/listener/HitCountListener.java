package com.ajaysoft.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class HitCountListener implements ServletRequestListener {

    int count = 0;
   
    public void requestInitialized(ServletRequestEvent sre)  { 
       System.out.println("requested created.....");   
       count =  count +1 ;
       ServletContext context = sre.getServletContext();
       context.setAttribute("count", count);
       
    }

	
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	
    	System.out.println("requested destroyed........");
         
    }
	
}
