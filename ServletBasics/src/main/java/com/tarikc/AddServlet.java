package com.tarikc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int b1 = Integer.parseInt(req.getParameter("num1"));
		int b2= Integer.parseInt(req.getParameter("num2"));
		int rez=b1+b2;
		
		req.setAttribute("rez", rez);
		
		res.getWriter().println("Result  is:"+rez);
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
		
	}
}
