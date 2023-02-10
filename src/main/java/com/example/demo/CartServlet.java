package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add2cart")
public class CartServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession sess=req.getSession();
		if(sess.getAttribute("cart") == null)
			sess.setAttribute("cart", new ArrayList<String>());
		
		
		ArrayList<String> existingCart=
				(ArrayList<String>)sess.getAttribute("cart");
		
		String prd=req.getParameter("product");
		existingCart.add(prd);
		res.getWriter().write(existingCart.toString());
	}

	/*
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}

}
