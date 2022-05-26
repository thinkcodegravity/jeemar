package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkUser")
public class UserServlet  extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			String uid=req.getParameter("userid");
			try {
				ArrayList<String> users=new ArrayList<String>();
				users.add("john");
				users.add("jane");
				users.add("mike");
				if(users.contains(uid))
					res.getWriter().write("unavailable");
				else
					res.getWriter().write("available");
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

