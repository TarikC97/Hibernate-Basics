package com.tarikc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int b1 = Integer.parseInt(req.getParameter("num1"));
		int b2= Integer.parseInt(req.getParameter("num2"));
		int rez=b1+b2;
		
		res.getWriter().println("<html><body bgcolor='cyan'>");
		res.getWriter().println("Rez:"+rez);
		res.getWriter().println("</body></html>");
		
		
		//Redirect
//		Cookie cookie = new Cookie("rez",rez+"");//Converting int to string
//		res.addCookie(cookie);	//Cookies
//		res.sendRedirect("square");
//		HttpSession session = req.getSession();//Sessions
//		session.setAttribute("rez", rez);
		
//		res.sendRedirect("square?b1="+b1);//Url rewritting
//		
//		Request Dispatcher
//		req.setAttribute("rez", rez);
//		res.getWriter().println("Result  is:"+rez);
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
	}
}
