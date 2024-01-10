package com.tarikc;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException  {
		 
		//Redirect
		
		//Session
		HttpSession session = req.getSession();
		int rez = (int)session.getAttribute("rez");
		rez=rez*rez;
		//Url rewritting
//		int b1 = Integer.parseInt(req.getParameter("b1"));
//		b1=b1*b1;
//		res.getWriter().println("Square:"+b1); 
		
		
		//RequestDispatcher
//		int rez = (int)req.getAttribute("rez");
//		rez = rez*rez;
		res.getWriter().println("Square is:"+rez);
	}
}
