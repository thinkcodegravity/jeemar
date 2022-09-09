package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add2Cart")
// http://localhost/add2Cart?productName=Iphone
public class CartServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession sess=req.getSession();
		sess.invalidate();
		
		if(sess.getAttribute("cart") == null )
		{
			// if cart entry does not exist in session
			// create brand new empty arraylist
			// in session table make an entry for
			// "cart" and new arraylist
			ArrayList<String> products=new ArrayList<String> ();
			sess.setAttribute("cart", products);
		}
		sess.setAttribute("login", true);
		sess.setAttribute("name", "john");
		sess.setAttribute("age", 10);
		
		
		// get access to the arraylist in the cart
		ArrayList<String> existingProducts=(ArrayList<String> )sess.getAttribute("cart");
		String prd=req.getParameter("productName");
		existingProducts.add(prd);
		res.getWriter().write(existingProducts.toString());
			
	}

	/*
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}

}
