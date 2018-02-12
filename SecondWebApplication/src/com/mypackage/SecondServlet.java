package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	resp.sendRedirect("AuthenticationServlet");
//	RequestDispatcher rd = req.getRequestDispatcher("AuthenticationServlet");
//	rd.forward(req, resp);
}
//	String p= req.getParameter("firstname");
//	String q= req.getParameter("lastname");
//	String r= req.getParameter("u");
//	String s= req.getParameter("password");
//	resp.setContentType("text/html");
//	PrintWriter pw=resp.getWriter();
//	pw.println("<html><body>welcome"+"  " +p +q+ "  "+"with username"+""+r+ "  "+"and password as"+""+s + "</body> </html>");

	}

