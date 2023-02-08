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
	
		// HTTP is 2 way communication..
		// Request : data transferrd from CLIENT to SERVER 
		// Response : data transfered back from SERVER to CLIENT
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			System.out.println(" in get");
		}
		// 2 main ways of transporting data
		// Get - text data, limited size, not safe, faster
		// Post - any digital data, unlimited size, safe, slower
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			System.out.println(" in post");
		}

	}

