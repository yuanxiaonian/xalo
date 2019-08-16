package com.xalo.spring06;

public class student {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}
	
}
