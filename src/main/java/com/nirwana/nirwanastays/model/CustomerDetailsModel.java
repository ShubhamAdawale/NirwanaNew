package com.nirwana.nirwanastays.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="customer_details")
public class CustomerDetailsModel {
	@Id
	private int id;
	private String F_name;
	private String L_name;
	private int numOfAdults;
	private int numOfChildren;
	private String email_id;
	private long phone_number;
	private int vegCount;
	private int nonvegCount;
	private String checkInDate;
	private String checkOutDate;
	private String additional_info;
	public CustomerDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetailsModel(int id, String f_name, String l_name, int numOfAdults, int numOfChildren,
			String email_id, long phone_number, int vegCount, int nonvegCount, String checkInDate, String checkOutDate,
			String additional_info) {
		super();
		this.id = id;
		F_name = f_name;
		L_name = l_name;
		this.numOfAdults = numOfAdults;
		this.numOfChildren = numOfChildren;
		this.email_id = email_id;
		this.phone_number = phone_number;
		this.vegCount = vegCount;
		this.nonvegCount = nonvegCount;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.additional_info = additional_info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return F_name;
	}
	public void setF_name(String f_name) {
		F_name = f_name;
	}
	public String getL_name() {
		return L_name;
	}
	public void setL_name(String l_name) {
		L_name = l_name;
	}
	public int getNumOfAdults() {
		return numOfAdults;
	}
	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
	}
	public int getNumOfChildren() {
		return numOfChildren;
	}
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public int getVegCount() {
		return vegCount;
	}
	public void setVegCount(int vegCount) {
		this.vegCount = vegCount;
	}
	public int getNonvegCount() {
		return nonvegCount;
	}
	public void setNonvegCount(int nonvegCount) {
		this.nonvegCount = nonvegCount;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getAdditional_info() {
		return additional_info;
	}
	public void setAdditional_info(String additional_info) {
		this.additional_info = additional_info;
	}
	@Override
	public String toString() {
		return "CustomerDetailsModel [id=" + id + ", F_name=" + F_name + ", L_name=" + L_name + ", numOfAdults="
				+ numOfAdults + ", numOfChildren=" + numOfChildren + ", email_id=" + email_id + ", phone_number="
				+ phone_number + ", vegCount=" + vegCount + ", nonvegCount=" + nonvegCount + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + ", additional_info=" + additional_info + "]";
	}

}
