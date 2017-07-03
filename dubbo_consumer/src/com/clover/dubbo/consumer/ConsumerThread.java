package com.clover.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clover.dubbo.api.DemoService;
import com.clover.dubbo.api.model.User;
public class ConsumerThread implements Runnable {

	@Override
	public void run() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConsumer.xml");
		
		context.start();
		context.getBean("demoService");
		
		DemoService service = (DemoService)context.getBean("demoService");
		
		String hello = service.sayHello("zhangdq");
		System.out.println(hello);
		
		System.out.println(service.findUseById(229).toString());
	}
	
	public static void main(String[] args) {
		new Thread(new ConsumerThread()).start();
	}
}
