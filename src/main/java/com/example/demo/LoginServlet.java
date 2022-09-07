package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authentication")
public class LoginServlet  extends HttpServlet {
	
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			if(req.getRemoteAddr().equals("1.2.3.4"))
			{
				res.getWriter().write("you are blocked");
				return;
			}
				
			String content=req.getHeader("content-type");
			//HttpServletRequest : access all customer data
			//HttpServletResponse : send response to customer
			String u =req.getParameter("uid");
			String p=req.getParameter("pass");
			if(u.equals("john") && p.equals("john1!"))
				res.getWriter().write("welcome john");
			else if(u.equals("jane") && p.equals("jane1!"))
			{
				byte[] binaryResponse="qweqwe".getBytes();
				res.getOutputStream().write(binaryResponse);
			}
			else if(u.equals("java") && p.equals("jee"))
				req.getRequestDispatcher("welcome.html").forward(req, res);
			else
				res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
			
		}
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			doGet(req,res);
		}

	}

