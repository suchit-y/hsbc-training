package com.hsbc.tr.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        
        if(pwd.equals("1234"))
        {
        	Cookie loginCookie = new Cookie("user",uname);
			//setting cookie to expiry in 10 seconds
			loginCookie.setMaxAge(10);
			response.addCookie(loginCookie);
			response.sendRedirect("login-success.jsp");
        }
	}

}
