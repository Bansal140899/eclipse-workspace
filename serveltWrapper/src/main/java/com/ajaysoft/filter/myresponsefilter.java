package com.ajaysoft.filter;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import com.ajaysoft.myresponse.MyResponse;

/**
 * Servlet Filter implementation class myresponsefilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.ERROR }
					, urlPatterns = { "/hello" })
public class myresponsefilter extends HttpFilter implements Filter {
       
    
    
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletResponse hres = (HttpServletResponse) response;
		
		MyResponse mres =  new MyResponse(hres);
		
		
		chain.doFilter(request, mres);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
