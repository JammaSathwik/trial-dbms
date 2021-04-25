package net.codejava;

public class App {
	private int id;
	private String patient_name;
	private String which_day;
	private String which_slot;
	
	public App(int id,String patient_name, String which_day, String which_slot) {
		super();
		this.id=id;
		this.patient_name = patient_name;
		this.which_day = which_day;
		this.which_slot = which_slot;
	}
	
	public int getid() {return id;}
	public void setid(int id) {this.id=id;}
	
	public String getPatient_name() {return patient_name;}
	public void setPatient_name(String patient_name) {this.patient_name = patient_name;}
	
	public String getWhich_day() {return which_day;}
	public void setWhich_day(String which_day) {this.which_day = which_day;}
	
	public String getWhich_slot() {return which_slot;}
	public void setWhich_slot(String which_slot) {this.which_slot = which_slot;}
	
}
