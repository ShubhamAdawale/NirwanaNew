package com.nirwana.nirwanastays.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booking_details")
public class BookingDetailsModel {
@Id
private int token_id;
private String customer_name;
private long phone_number;
private String camp_name;
private int number_of_adults;
private int number_of_children;
private String startDate;
private String endDate;
private double advance_Amount;
private double remaining_Amount;
public BookingDetailsModel() {
	super();
	// TODO Auto-generated constructor stub
}
public BookingDetailsModel(int token_id, String customer_name, long phone_number, String camp_name,
		int number_of_adults, int number_of_children, String startDate, String endDate, double advance_Amount,
		double remaining_Amount) {
	super();
	this.token_id = token_id;
	this.customer_name = customer_name;
	this.phone_number = phone_number;
	this.camp_name = camp_name;
	this.number_of_adults = number_of_adults;
	this.number_of_children = number_of_children;
	this.startDate = startDate;
	this.endDate = endDate;
	this.advance_Amount = advance_Amount;
	this.remaining_Amount = remaining_Amount;
}
public int getToken_id() {
	return token_id;
}
public void setToken_id(int token_id) {
	this.token_id = token_id;
}
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public long getPhone_number() {
	return phone_number;
}
public void setPhone_number(long phone_number) {
	this.phone_number = phone_number;
}
public String getCamp_name() {
	return camp_name;
}
public void setCamp_name(String camp_name) {
	this.camp_name = camp_name;
}
public int getNumber_of_adults() {
	return number_of_adults;
}
public void setNumber_of_adults(int number_of_adults) {
	this.number_of_adults = number_of_adults;
}
public int getNumber_of_children() {
	return number_of_children;
}
public void setNumber_of_children(int number_of_children) {
	this.number_of_children = number_of_children;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public double getAdvance_Amount() {
	return advance_Amount;
}
public void setAdvance_Amount(double advance_Amount) {
	this.advance_Amount = advance_Amount;
}
public double getRemaining_Amount() {
	return remaining_Amount;
}
public void setRemaining_Amount(double remaining_Amount) {
	this.remaining_Amount = remaining_Amount;
}

@Override
public String toString() {
	return "BookingDetailsModel [token_id=" + token_id + ", customer_name=" + customer_name + ", phone_number="
			+ phone_number + ", camp_name=" + camp_name + ", number_of_adults=" + number_of_adults
			+ ", number_of_children=" + number_of_children + ", startDate=" + startDate + ", endDate=" + endDate
			+ ", advance_Amount=" + advance_Amount + ", remaining_Amount=" + remaining_Amount + "]";
}

}
