package com.clover.dubbo.api.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static long serialVersionUID = 1L;

	private long id;
	private String name;
	private int age;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString(){
		return "USER [ ID = " + this.id + ", NAME = " + this.name + ", AGE = " + this.age + "]";
	}
}
