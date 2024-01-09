package com.tarikc;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int b1 = Integer.parseInt(req.getParameter("num1"));
		int b2= Integer.parseInt(req.getParameter("num2"));
		int rez=b1+b2;
		res.getWriter().println("Result  is:"+rez);
		RequestDispatcher rd = req.getRequestDispatcher("square");
		
	}
}
