package com.example.lti.controller;



public class Customer {
	

	private int id;
	private String name;
	private int age;
	private String address;

	private String type;
	
	public Customer() {
		
	}

	public Customer(int id, String name, int age, String address, String type) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", type=" + type
				+ "]";
	}
	
}
