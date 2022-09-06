package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authentication")
public class LoginServlet  extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			//HttpServletRequest : access all customer data
			//HttpServletResponse : send response to customer
			String user=req.getParameter("uid");
			String pass=req.getParameter("pass");
			if(user.equals("java") && pass.equals("jee"))
				res.getWriter().write("login is success. welcome");
			else
				res.getWriter().write("login failed");
			
		}
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			doGet(req,res);
		}

	}

