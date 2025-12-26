package com.ajaysoft.listner;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener("/HitCountServlet")
public class HitCountListener implements ServletRequestListener {

   
  int count =0;
  
    public void requestInitialized(ServletRequestEvent event)  { 
    	count = count+1;
    	event.getServletContext().setAttribute("count", count);
    	System.out.println("request created...");
       
    }

	
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	
    	System.out.println("request destroyed...");
    }
	
}
