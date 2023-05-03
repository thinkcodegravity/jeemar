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

@WebServlet("/reg")
public class RegServlet  extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String uid=req.getParameter("username");
		res.sendRedirect("welcome.html");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req,res);
	}

}

