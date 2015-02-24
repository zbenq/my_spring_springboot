package com.zbq.myspring.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zbq.myspring.domain.User;
import com.zbq.myspring.service.TestService;

@RestController
public class TestController {
	
	private static final Logger logger = Logger.getLogger(TestController.class);

	@Autowired
	private TestService testService;

	@RequestMapping("/getUser")
	public List<User> getUser(
			@RequestParam(value = "name", required = false) String name) {
		return testService.getUser(name);
	}
}
