//package com.flightapp.entity;
//
//import javax.persistence.*;
//
//@Entity
//public class Passenger {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long pid;
//	private String passengerName;
//	private int passengerAge;
//	private String passengerGender;
//	@ManyToOne
//	@JoinColumn(name = "pnrNumber")
//	Booking booking;
//
//	public Passenger() {
//	}
//
//	public Passenger(String passengerName, int passengerAge, String passengerGender, Booking booking) {
//		this.passengerName = passengerName;
//		this.passengerAge = passengerAge;
//		this.passengerGender = passengerGender;
//		this.booking = booking;
//	}
//
//	public Passenger(long pid, String passengerName, int passengerAge, String passengerGender, Booking booking) {
//		this(passengerName, passengerAge, passengerGender, booking);
//		this.pid = pid;
//	}
//
//	public long getPid() {
//		return pid;
//	}
//
//	public void setPid(long pid) {
//		this.pid = pid;
//	}
//
//	public String getPassengerName() {
//		return passengerName;
//	}
//
//	public void setPassengerName(String passengerName) {
//		this.passengerName = passengerName;
//	}
//
//	public int getPassengerAge() {
//		return passengerAge;
//	}
//
//	public void setPassengerAge(int passengerAge) {
//		this.passengerAge = passengerAge;
//	}
//
//	public String getPassengerGender() {
//		return passengerGender;
//	}
//
//	public void setPassengerGender(String passengerGender) {
//		this.passengerGender = passengerGender;
//	}
//
//	public Booking getBooking() {
//		return booking;
//	}
//
//	public void setBooking(Booking booking) {
//		this.booking = booking;
//	}
//
//	@Override
//	public String toString() {
//		return "Passenger[" +
//				"pid=" + pid +
//				", passengerName='" + passengerName + '\'' +
//				", passengerAge=" + passengerAge +
//				", passengerGender='" + passengerGender + '\'' +
//				", booking=" + booking +
//				']';
//	}
//}
