package com.hsbc.tr.web.dao;

import java.util.List;

import com.hsbc.tr.web.entity.ServiceRequest;

public interface ServiceRequestDao {
	public int register(ServiceRequest sr);
	public List<ServiceRequest> getReqList();
}
