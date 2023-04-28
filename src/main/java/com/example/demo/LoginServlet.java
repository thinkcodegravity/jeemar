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

// link/expose this program over http url
// http://localhost/authentication
@WebServlet("/authentication")
// LoginServlet program is exposed over internet
// communication on internet happens over HTTP
// Therefore LoginServlet should know/understand HTTP works
//		extends HTTPServlet
public class LoginServlet  extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			//HttpServletRequest req = access what customer's browser is sending
			//	username=abc&pass=xyz
			String uid=req.getParameter("username");
			String pwd=req.getParameter("pass");
			//HttpServletResponse res = send response back to customer's browser
			/*
			  response types
			  	Text : alphanumeric text response
			  			res.getWriter().write("hello");
			  	Binary : images/video/audio
			  			res.getOutputStream().write( binary array);
			  	webpage
			  		redirect : when webpage response to be sent is part of ANOTHER website/company
			  		forward : when webpage response to be sent is part of SAME website
			 */
			
			if(uid.equals("john") && pwd.equals("john1!"))
				//res.getWriter().write("LOGIN SUCCESSFULL");
				req.getRequestDispatcher("welcome.html").forward(req, res);
			else
				res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=US&continue=https%3A%2F%2Fwww.google.com%2F&dsh=S-670683149%3A1682697169462142&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ifkv=Af_xneG40--ZYT4gX8Mqikr-QTPHsiwSnMUZi1fsvKq3EMWlNi0JayepAutGlc_8ifZLSnnXTd8WNQ");
				
		}
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			doGet(req,res);
		}
	}

