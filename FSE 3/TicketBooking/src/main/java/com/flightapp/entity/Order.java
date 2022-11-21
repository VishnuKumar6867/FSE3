package com.flightapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_Details")
public class Order {
	
	@Id
	private String trnNumber;
	private long itemId;
	private String name;
	private String email;
	private int quantity;
	private String customers;
	private double price;

	public Order() {
	}

	public Order(String trnNumber, long itemId, String name, String email, int quantity, String customers, double price) {
		this.trnNumber = trnNumber;
		this.itemId = itemId;
		this.name = name;
		this.email = email;
		this.quantity = quantity;
		this.customers = customers;
		this.price = price;
	}

	public String getTrnNumber() {
		return trnNumber;
	}

	public void setTrnNumber(String trnNumber) {
		this.trnNumber = trnNumber;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order{" +
				"trnNumber='" + trnNumber + '\'' +
				", itemId=" + itemId +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", quantity=" + quantity +
				", customers='" + customers + '\'' +
				", price=" + price +
				'}';
	}
}
