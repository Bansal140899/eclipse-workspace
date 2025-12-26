package com.ajaysoft.listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class sessionlistner
 *
 */
@WebListener
public class sessionlistner implements HttpSessionListener, HttpSessionAttributeListener {

   
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	   System.out.println("attribute replacesd ["+se.getName()+","+se.getValue());
    }

	
    public void sessionCreated(HttpSessionEvent se)  { 
      System.out.println("session creatyeddd.....");    
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("session is destroyed....");
    }

	
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	   System.out.println("attribute removed ["+se.getName()+","+se.getValue());
    }

	
    public void attributeAdded(HttpSessionBindingEvent se)  { 
        System.out.println("attribute addes ["+se.getName()+","+se.getValue());
    }
	
}
