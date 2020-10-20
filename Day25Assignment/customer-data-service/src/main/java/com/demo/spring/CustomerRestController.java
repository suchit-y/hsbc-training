package com.demo.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Customer;
import com.demo.spring.exception.CustomerAlreadyExistsException;
import com.demo.spring.exception.CustomerNotFoundException;
import com.demo.spring.exception.DbEmptyException;
import com.demo.spring.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerRestController {

	@Autowired
	CustomerService service;

	@GetMapping(path = "/cust/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> register(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("mobile") long mobile) {
		try {
			Customer cust = new Customer(id, name, mobile);
			if (service.registerCustomer(cust.getCustomerId(), cust))
				return ResponseEntity.ok("{\"status\":\"Customer registered\"}");
			else
				return ResponseEntity.ok("{\"status\":\"Unknown\"}");

		} catch (CustomerAlreadyExistsException e) {
			e.printStackTrace();
			return ResponseEntity.ok("{\"status\":\"Customer exists\"}");
		}
	}

	@GetMapping(path = "/cust", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity showDetails() {
		try {
			ArrayList<Customer> custList = new ArrayList<>(service.showCustomers());
			return ResponseEntity.ok(custList);
		} catch (DbEmptyException e) {
			e.printStackTrace();
			return ResponseEntity.ok("{\"status\":\"DB Empty\"}");
		}
	}

	@GetMapping(path = "/cust/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findCustomer(@PathVariable("id") int id) {
		try {
			Customer customer = service.findCustomerById(id);
			if (customer != null)
				return ResponseEntity.ok(customer);
			else
				return ResponseEntity.ok("{\"status\":\"Unknown\"}");
		} catch (CustomerNotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.ok("{\"status\":\"Customer not found\"}");
		}
	}
}
