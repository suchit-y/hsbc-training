package com.hsbc.tr.web.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.tr.web.entity.ServiceRequest;

public class ServiceRequestDaoImpl implements ServiceRequestDao {

	public List<ServiceRequest> reqList = new ArrayList<ServiceRequest>();

	@Override
	public int register(ServiceRequest sr) {
		reqList.add(sr);
		return 1;
	}

	@Override
	public List<ServiceRequest> getReqList() {
		return reqList;
	}

}
