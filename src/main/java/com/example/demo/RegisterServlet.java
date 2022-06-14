package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet  extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			String uid=req.getParameter("userid");
			String pwd=req.getParameter("password");
			try {
				Connection conn=DatabaseConnection.getDBConnection();
				UsersTable.registerUser(uid, pwd, conn);
				res.sendRedirect("success.html");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			doGet(req,res);
		}

	}

