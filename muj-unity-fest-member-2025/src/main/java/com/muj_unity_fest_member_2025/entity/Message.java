package com.muj_unity_fest_member_2025.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="message")
public class Message {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="type_of_enquiry")
	private String typeOfEnquiry;
	@Column(name="subject")
	private String subject;
	@Column(name="message")
	private String message;
	@Column(name="email",unique = true)
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTypeOfEnquiry() {
		return typeOfEnquiry;
	}
	public void setTypeOfEnquiry(String typeOfEnquiry) {
		this.typeOfEnquiry = typeOfEnquiry;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Message(Integer id, String firstName, String lastName, String phoneNumber, String typeOfEnquiry,
			String subject, String message, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.typeOfEnquiry = typeOfEnquiry;
		this.subject = subject;
		this.message = message;
		this.email = email;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", typeOfEnquiry=" + typeOfEnquiry + ", subject=" + subject + ", message=" + message
				+ ", email=" + email + "]";
	}
	
	
	
}
