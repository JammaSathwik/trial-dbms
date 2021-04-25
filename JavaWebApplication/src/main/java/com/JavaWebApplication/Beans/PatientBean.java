package com.JavaWebApplication.Beans;

public class PatientBean {
	private String name;
	private String phone;
	
	public PatientBean(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
	
}
