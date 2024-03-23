package com.tarikc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;



@WebServlet("/addFilter")
public class Filter extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		System.out.println("Servlet Filter");
		
		String ime = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		
		//out.print("Podaci:"+ime+" "+id);	
	}
 

}
