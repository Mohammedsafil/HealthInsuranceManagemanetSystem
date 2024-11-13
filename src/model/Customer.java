package model;

import java.sql.Date;

public class Customer {
	private int customerID;
	private String customerName;
	private String phone;
	private String dateOfBirth;
	private String gender;
	
	
	public Customer(int customerID, String customerName, String phone, String dateOfBirth, String gender) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
