package com.clover.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[]{"applicationProvider.xml"});
		context.start();
		System.out.println("Press any key to exit.");
		System.in.read();
		context.stop();
	}
}
