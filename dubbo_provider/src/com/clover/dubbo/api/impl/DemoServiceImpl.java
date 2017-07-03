package com.clover.dubbo.api.impl;

import com.clover.dubbo.api.DemoService;
import com.clover.dubbo.api.model.User;

public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		System.out.println("It is dubbo!");
		return "Hello " + name;
	}

	@Override
	public User findUseById(long id) {
		User user = new User();
		user.setId(id);
		user.setName("zhangdq");
		user.setAge(27);
		return user;
	}
}
