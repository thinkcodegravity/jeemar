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
				if(uid.equals("java") && pwd.equals("jee"))
					res.sendRedirect("success.html");
				else
					res.sendRedirect("error.html");
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

