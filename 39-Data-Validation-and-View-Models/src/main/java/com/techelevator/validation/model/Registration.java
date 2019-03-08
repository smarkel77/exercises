package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;
/*
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
*/
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	
	@NotBlank(message="First name is required") 
	@Size(max=20, message="Name must be less than 20 characters") 
	@NotNull(message="First name is hhhrequired")
	private String firstName;
	
	@NotBlank(message="Last name is required") 
	@Size(max=20, message="Name must be less than 20 characters")  
	private String lastName;
	
	@NotBlank(message="Email address is required") 
	@Email(message="Please enter a valid email address")
	private String email;
	private String confirmEmail;
	
	
	@NotBlank(message="Password is required")
	@Size(min=8, message="Password must be more than 8 characters")
	private String password;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private LocalDate birthDate;
	
	@Min(value=1, message="Must have at least one ticket")
	@Max(value=10, message="Ypu can't order more than ten tickets")
	private int numOfTickets;
	
	private boolean emailEqual;
	@AssertTrue(message="Emails mut match")
	public boolean isEmailEqual() {
		if(email != null) {
			return email.equals(confirmEmail);
		}
		return true;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getNumOfTickets() {
		return numOfTickets;
	}

	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}
	
	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	

}
