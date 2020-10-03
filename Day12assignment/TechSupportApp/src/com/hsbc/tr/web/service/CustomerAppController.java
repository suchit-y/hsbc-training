package com.hsbc.tr.web.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import org.apache.catalina.authenticator.SavedRequest;

import com.hsbc.tr.web.dao.CustomerDao;
import com.hsbc.tr.web.dao.CustomerDaoImpl;
import com.hsbc.tr.web.dao.ServiceRequestDao;
import com.hsbc.tr.web.dao.ServiceRequestDaoImpl;
import com.hsbc.tr.web.entity.Customer;
import com.hsbc.tr.web.entity.ServiceRequest;

/**
 * Servlet implementation class CustomerAppController
 */
public class CustomerAppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		CustomerDao dao = new CustomerDaoImpl();
		ServiceRequestDao srdao = new ServiceRequestDaoImpl();

		String action = request.getParameter("action");
		System.out.println(action);

		if (action.equals("register")) {
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String phone = request.getParameter("phone");
			String email = request.getParameter("email");

			TechSupportService service1 = new TechSupportService(dao);

			if (service1.saveCustomer(fname, lname, phone, email)) {

				TechSupportService service2 = new TechSupportService(srdao);

				String mail = (String) request.getSession().getAttribute("email");
				String os = (String) request.getSession().getAttribute("os");
				String software = (String) request.getSession().getAttribute("software");
				String problem = (String) request.getSession().getAttribute("problem");

				service2.saveRequest(mail, os, software, problem);
				System.out.println(service2.displayRequest().get(0).getProblem());

				request.getSession().setAttribute("next", "confirm");
				request.getRequestDispatcher("/register.jsp").forward(request, response);

//				request.getRequestDispatcher("/confirm.jsp").forward(request, response);

			}

		} else if (action.equals("display")) {
			TechSupportService service1 = new TechSupportService(dao);
			TechSupportService service2 = new TechSupportService(srdao);

			List<Customer> custList = service1.displayCutomers();
			List<ServiceRequest> reqList = service2.displayRequest();

			HashMap<String, ServiceRequest> list = new HashMap<>();

			Iterator<Customer> itr1 = custList.iterator();
			Iterator<ServiceRequest> itr2 = reqList.iterator();

			while (itr1.hasNext() && itr2.hasNext()) {
				list.put(itr1.next().getEmail(), itr2.next());
			}

			request.getSession().setAttribute("list", list);
			request.getSession().setAttribute("custList", custList);
			
			System.out.println(list);

			request.getRequestDispatcher("/customerDetails.jsp").forward(request, response);

		} else if (action.equals("addRequest")) {
			String email = request.getParameter("email");
			String os = request.getParameter("os");
			String software = request.getParameter("software");
			String problem = request.getParameter("problem");

			TechSupportService service1 = new TechSupportService(dao);

			if (service1.isRegistered(email)) {
				TechSupportService service2 = new TechSupportService(srdao);

				service2.saveRequest(email, os, software, problem);
				System.out.println(service2.displayRequest());

				request.getSession().setAttribute("next", "confirm");
				request.getRequestDispatcher("/checkUser.jsp").forward(request, response);

				// request.getRequestDispatcher("/confirm.jsp").forward(request, response);
			} else {
				request.getSession().setAttribute("email", email);
				request.getSession().setAttribute("os", os);
				request.getSession().setAttribute("software", software);
				request.getSession().setAttribute("problem", problem);

				request.getSession().setAttribute("next", "registerForm");
				request.getRequestDispatcher("/checkUser.jsp").forward(request, response);

				// request.getRequestDispatcher("/registerForm.jsp").forward(request, response);
			}
		}
	}
}
