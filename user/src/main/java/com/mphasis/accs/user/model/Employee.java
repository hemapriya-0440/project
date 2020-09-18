package com.mphasis.accs.user.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employee {
public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
@NotBlank
private String empid;
@NotNull
@NotBlank
private String firstName;
@NotNull
@NotBlank
private String lastName;
@NotNull
@NotBlank
private String phoneno;
@NotNull
@Enumerated(EnumType.STRING)
private  Gender gender;
@Email
@NotBlank
@NotNull
private String emailid;
public long getId() {
	return id;
}
public void setId(long id) {
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
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public Employee(long id, String empid, String firstName, String lastName, String phoneno, Gender gender,
		@Email String emailid) {
	super();
	this.id = id;
	this.empid = empid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneno = phoneno;
	this.gender = gender;
	this.emailid = emailid;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
  

}
