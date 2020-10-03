package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFormProcess extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<html>");

		out.print("<form action=\"form2\" method=\"get\" name=myForm>");
		out.print("<table>");
		out.print("<tr>");
		out.print("<td><label>Enter Name: </label></td>");
		out.print("<td><input type=text name=name></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label>Enter Email: </label></td>");
		out.print("<td><input type=email name=email></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><input type=submit value=Submit></td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</form>");

		out.print("</html>");

		String name = req.getParameter("name");
		String email = req.getParameter("email");

		out.print("<h3>Name: " + name + "</h3>");
		out.print("<h3>Email: " + email + "</h3>");
	}
}
