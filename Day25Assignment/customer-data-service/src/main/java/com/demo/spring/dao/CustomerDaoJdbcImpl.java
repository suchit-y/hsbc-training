package com.demo.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public class CustomerDaoJdbcImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public boolean register(int id, Customer cust) {
		final String query = "INSERT INTO CUSTOMERS VALUES(?,?,?)";
		int row = jt.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, cust.getCustomerId());
				ps.setString(2, cust.getCustomerName());
				ps.setLong(3, cust.getMobile());
				return ps;
			}
		});
		if (row > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Customer> showCustomers() {
		final String query = "SELECT * FROM CUSTOMERS";

		List<Customer> custList = jt.query(query, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Customer(rs.getInt(1), rs.getString(2), Long.parseLong(rs.getString(3)));
			}

		});
		return custList;
	}

	@Override
	public Customer findCustomerById(int id) {
		final String query = "SELECT * FROM CUSTOMERS WHERE CUSTID=" + id;

		Customer customer = jt.queryForObject(query, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer cust = new Customer(rs.getInt(1), rs.getString(2), Long.parseLong(rs.getString(3)));
				return cust;
			}
		});
		return customer;
	}

}
