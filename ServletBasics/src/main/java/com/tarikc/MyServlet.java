package com.tarikc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("My Params");
		//Servlet Context
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("Phone");
		ServletConfig cfg = getServletConfig();
		String str = cfg.getInitParameter("name");
		out.println(str);
		
	}
}
