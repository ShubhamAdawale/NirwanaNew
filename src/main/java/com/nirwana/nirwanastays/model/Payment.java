package com.nirwana.nirwanastays.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_details")
public class Payment {
	@Id
	public String adult_price;
	public String children_price;
	public String getAdult_price() {
		return adult_price;
	}
	public void setAdult_price(String adult_price) {
		this.adult_price = adult_price;
	}
	public String getChildren_price() {
		return children_price;
	}
	public void setChildren_price(String children_price) {
		this.children_price = children_price;
	}
	@Override
	public String toString() {
		return "Payment [adult_price=" + adult_price + ", children_price=" + children_price + "]";
	}
	public void addAttribute(String string, Payment payment) {
		// TODO Auto-generated method stub
		
	}

}
