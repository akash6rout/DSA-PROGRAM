package com.bean;

public class Akash {

	private int id;
	private String name;
	public Akash(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Akash [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		
		Akash ak=new Akash(12,"akshhhhhh");
		System.out.println(ak);
	}
}
