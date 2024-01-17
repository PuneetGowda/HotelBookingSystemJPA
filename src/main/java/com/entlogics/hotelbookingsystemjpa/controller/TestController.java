package com.entlogics.hotelbookingsystemjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.hotelbookingsystemjpa.service.ITestService;

@RequestMapping("/testapi")
@Controller
public class TestController {
	
	@Autowired
	private ITestService test;

	@RequestMapping("/test")
	public void testMethod() {
	
		test.testMethod();
	}

	
}
