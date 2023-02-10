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

// Connects the html buttons/submits to this program.. 
// using form action <form action="authentication">
@WebServlet("/authentication")

// customer is communicating over the interent
// customer is transporting data over the internet using
// transporation software = HTTP
// this program should support HTTP transportation software
public class LoginServlet  extends HttpServlet {
// init, service, doget, dopost,	destroy
// doget, dopost = write code for your logic
// 
		// HTTP is 2 way communication..
		// Request : data transferrd from CLIENT to SERVER 
		// Response : data transfered back from SERVER to CLIENT
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			// check customer request
			String uid=req.getParameter("username");
			String pwd=req.getParameter("pass");
			String customerIp=req.getRemoteAddr();
			String blackListedIp="12.11.11.10";
			// send response to customer
			if(customerIp==blackListedIp )
			{
				String textRes="your account is blacklisted";
				byte[] binaryRes=textRes.getBytes();
				res.getOutputStream().write(binaryRes);
				res.getWriter().write(textRes);
			}
			
			// text response
			// binary response (non-textual digital content - image/video)
			// webpage response
				// redirect
				// forward
			if(uid.equals("john") &&pwd.equals("john1!"))
			{
				req.getRequestDispatcher("welcome.jsp").forward(req, res);
			}
			else
				res.sendRedirect("https://accounts.google.com/signup");
			
			
			
		}
		// 2 main ways of transporting data
		// Get - text data, limited size, not safe, faster
		// Post - any digital data, unlimited size, safe, slower
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			String uid=req.getParameter("username");
			String pwd=req.getParameter("pass");
			if(uid.equals("john") &&pwd.equals("john1!"))
			{
				req.getRequestDispatcher("welcome.jsp").forward(req, res);
			}
			else
				res.sendRedirect("https://accounts.google.com/signup");
			
		}
	}

