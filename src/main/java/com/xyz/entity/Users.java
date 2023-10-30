package com.xyz.entity;

public class Users {

	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	
	public Users() {
		super();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Users(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	
}
