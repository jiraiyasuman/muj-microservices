package com.muj_unity_fest_member_2025.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class MessageDto {

	private Integer id;
	@Schema
	@NotEmpty
	private String firstName;
	@Schema
	@NotEmpty
	private String lastName;
	@Schema
	@NotEmpty
	@Email
	private String email;
	@Schema
	@NotEmpty
	private String phoneNumber;
	@Schema
	@NotEmpty
	private String subject;
	@Schema
	@NotEmpty
	private String message;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public MessageDto(Integer id, @NotEmpty String firstName, @NotEmpty String lastName, @NotEmpty @Email String email,
			@NotEmpty String phoneNumber, @NotEmpty String subject, @NotEmpty String message) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.subject = subject;
		this.message = message;
	}
	public MessageDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MessageDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", subject=" + subject + ", message=" + message + "]";
	}
	
}
