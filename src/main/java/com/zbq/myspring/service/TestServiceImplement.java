package com.zbq.myspring.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zbq.myspring.domain.User;
import com.zbq.myspring.mapper.TestMapper;

@Service("testService")
public class TestServiceImplement implements TestService {

	private static final Logger logger = Logger
			.getLogger(TestServiceImplement.class);

	@Autowired
	private TestMapper testMapper;

	@Override
	public List<User> getUser(String name) {
		List<User> userList = testMapper.selectUser(name);
		if(null == userList || userList.size()<1){
			logger.info("没有找到用户"+name);
		}
		return userList;
	}

}
