package com.zbq.myspring.mapper;

import java.util.List;

import com.zbq.myspring.domain.User;

public interface TestMapper {
	public List<User> selectUser(String name);
}
