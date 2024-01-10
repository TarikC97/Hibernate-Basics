package com.tarikc;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException  {
		 
		int rez = (int)req.getAttribute("rez");
		rez = rez*rez;
		res.getWriter().println("Square is:"+rez);
	}
}
