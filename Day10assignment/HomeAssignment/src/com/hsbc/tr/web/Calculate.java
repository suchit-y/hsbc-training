package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculate
 */
public class Calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String a1 = req.getParameter("a");
		String b1 = req.getParameter("b");
		String operation = req.getParameter("operation");
		Double result = 0.0;

		if (a1 == "" || b1 == "") {

			out.print("<h3>Enter all the values...</h3>");

		} else {
			Double a = Double.parseDouble(a1);
			Double b = Double.parseDouble(b1);

			if (operation.equals("Add"))
				result = a + b;
			else if (operation.equals("Multiply"))
				result = a * b;
			else if (operation.equals("Divide"))
				result = a / b;
			else if (operation.equals("Subtract"))
				result = a - b;

			out.print("<h3>Result: " + result + "</h3>");
		}

	}

}
