package com.JavaWebApplication.Beans;

public class DoctorBean {
	private String category;
	private String appointment;
	private String slot;
	
	public DoctorBean(String category, String appointment, String slot) {
		super();
		this.category = category;
		this.appointment = appointment;
		this.slot = slot;
	}
	
	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
	public String getAppointment() {return appointment;}
	public void setAppointment(String appointment) {this.appointment = appointment;}
	public String getSlot() {return slot;}
	public void setSlot(String slot) {this.slot = slot;}
	
}
