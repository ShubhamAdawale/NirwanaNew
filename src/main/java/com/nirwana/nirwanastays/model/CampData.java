package com.nirwana.nirwanastays.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="camp")
public class CampData {
	@Id
	private int booking_id;
	private String checkin;
	private String checkout;
	private int adults;
	private int children;
	private String food;
	public CampData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CampData(int booking_id, String checkin, String checkout, int adults, int children, String food) {
		super();
		this.booking_id = booking_id;
		this.checkin = checkin;
		this.checkout = checkout;
		this.adults = adults;
		this.children = children;
		this.food = food;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "CampData [booking_id=" + booking_id + ", checkin=" + checkin + ", checkout=" + checkout + ", adults="
				+ adults + ", children=" + children + ", food=" + food + "]";
	}

}
