package com.hsbc.tr.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greet
 */
public class Greet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String action = request.getParameter("action");

		if (action.equals("Include")) {
			out.print("<h2>Welcome " + name + "!</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
			rd.include(request, response);
		} else if (action.equals("Forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("greet.jsp");
			rd.forward(request, response);
		} else if (action.equals("Redirect")) {
			response.sendRedirect("https://www.hsbc.co.in/");
		}
	}
}
