package com.mypackage;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationServlet extends HttpServlet{
	protected void dopost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String p= req.getParameter("firstname");
	String q= req.getParameter("lastname");
	String r= req.getParameter("u");
	String s= req.getParameter("password");
	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();
	String passwordFromDb="java";
	if(s.equals(passwordFromDb)){
	pw.println("success");
	}
	
	else{
		pw.println("failure");
	}
	}

}
	