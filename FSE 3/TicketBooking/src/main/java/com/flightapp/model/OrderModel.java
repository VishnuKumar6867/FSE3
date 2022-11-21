package com.flightapp.model;

import java.util.ArrayList;
import java.util.List;

public class OrderModel {
	private String name;
	private String email;
	List<CustomerModel> customers = new ArrayList<>();
	//private String mealType;
	private int quantity;

	public OrderModel() {
	}

	public OrderModel(String name, String email, List<CustomerModel> customers, int quantity) {
		this.name = name;
		this.email = email;
		this.customers = customers;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CustomerModel> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerModel> customers) {
		this.customers = customers;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderModel{" +
				"name='" + name + '\'' +
				", email='" + email + '\'' +
				", customers=" + customers +
				", quantity='" + quantity + '\'' +
				'}';
	}
}
