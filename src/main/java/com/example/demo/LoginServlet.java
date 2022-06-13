package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authentication")
public class LoginServlet  extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			String uid=req.getParameter("userid");
			String pwd=req.getParameter("password");
			Set<String> names;
			try {
				/*
				if(uid.equals("java") && pwd.equals("jee"))
					req.getRequestDispatcher("success.html").forward(req, res);
				else
					res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&dsh=S-1475795627%3A1654813588595074&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
					*/
				if(uid.equals("java") && pwd.equals("jee"))
				{
					res.getWriter().write("this is text success response");
					res.getWriter().flush();
					res.getWriter().close();
				}
				else
				{
					String failureMessage="this is binary failure response";
					byte[] failureBinaryData=failureMessage.getBytes();
					res.getOutputStream().write(failureBinaryData);
					res.getOutputStream().flush();
					res.getOutputStream().close();
					
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			res.getWriter().flush();
			res.getWriter().close();
		}

		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			doGet(req,res);
		}

	}

