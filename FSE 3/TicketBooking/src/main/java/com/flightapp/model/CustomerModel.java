package com.flightapp.model;

public class CustomerModel {

	private String customerName;
	private int customerAge;
	private String customerGender;

	public CustomerModel() {
	}

	public CustomerModel(String customerName, int customerAge, String customerGender) {
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerGender = customerGender;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	@Override
	public String toString() {
		return "CustomerModel{" +
				"customerName='" + customerName + '\'' +
				", customerAge=" + customerAge +
				", customerGender='" + customerGender + '\'' +
				'}';
	}
}

