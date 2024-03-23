package com.tarikc;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;



@WebFilter("/addFilter")
public class IdFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		//Converting request obj to req http obj,
		//TypeCasting
		HttpServletRequest req = (HttpServletRequest) request;
		int id = Integer.parseInt(request.getParameter("id"));
		if(id >= 1) { 
			chain.doFilter(request, response);
				//out.println("Id:"+id);
		}				
		else
			out.println("Invalid Input!");
		String ime = request.getParameter("name");
		if(ime.length()> 3) {
			chain.doFilter(request, response);
			//out.println("Ime:"+ime);
		}			
		else
			out.println("Name must have more than 3 characters");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
