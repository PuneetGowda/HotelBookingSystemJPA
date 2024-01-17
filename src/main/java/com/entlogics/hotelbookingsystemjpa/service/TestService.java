package com.entlogics.hotelbookingsystemjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entlogics.hotelbookingsystemjpa.dao.ITestDAO;

@Service
public class TestService implements ITestService {

	@Autowired
	private ITestDAO test;
	
	@Override
	@Transactional
	public void testMethod() {

		test.testMethod();
		
	}

	
}
