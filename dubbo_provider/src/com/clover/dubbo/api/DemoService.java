package com.clover.dubbo.api;

import com.clover.dubbo.api.model.User;

public interface DemoService {
	public String sayHello(String name);
	public User findUseById(long id);
}
