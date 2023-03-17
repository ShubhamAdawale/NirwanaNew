package com.nirwana.nirwanastays.model;

public class Contact {
	public String firstName;
	  public String lastName;
	  public String email;
	  public String dateOfBirth;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String firstName, String lastName, String email, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

}
