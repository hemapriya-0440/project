package com.mphasis.accs.user.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

public class EmployeeRegisterDto {
	
 	private long empId;		 	
 	
  
	private String firstName;
    
	private String lastName;
 
 	private String mailId;		 	
	private String mobileNo;		 	
	public String doB;
	private String projectId;		 	 
	private String projectName;		 	 
	private String repManager;		 	 
	private String projRole;		 	 
	private int exp;
	private String ALine1;			

	private String ALine2;			
	
	private String City;			
	
	private String State;	
	
	private String Country;	
    
 	private String pinCode;
	public String workLoc;			
	public String odcAccReq;			
	public String desReq;		    
	public String seatTag;
	public EmployeeRegisterDto(long empId, String firstName, String lastName, String mailId, String mobileNo,
			String doB, String projectId, String projectName, String repManager, String projRole, int exp,
			String aLine1, String aLine2, String city, String state, String country, String pinCode, String workLoc,
			String odcAccReq, String desReq, String seatTag) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailId = mailId;
		this.mobileNo = mobileNo;
		this.doB = doB;
		this.projectId = projectId;
		this.projectName = projectName;
		this.repManager = repManager;
		this.projRole = projRole;
		this.exp = exp;
		ALine1 = aLine1;
		ALine2 = aLine2;
		City = city;
		State = state;
		Country = country;
		this.pinCode = pinCode;
		this.workLoc = workLoc;
		this.odcAccReq = odcAccReq;
		this.desReq = desReq;
		this.seatTag = seatTag;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDoB() {
		return doB;
	}
	public void setDoB(String doB) {
		this.doB = doB;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getRepManager() {
		return repManager;
	}
	public void setRepManager(String repManager) {
		this.repManager = repManager;
	}
	public String getProjRole() {
		return projRole;
	}
	public void setProjRole(String projRole) {
		this.projRole = projRole;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getALine1() {
		return ALine1;
	}
	public void setALine1(String aLine1) {
		ALine1 = aLine1;
	}
	public String getALine2() {
		return ALine2;
	}
	public void setALine2(String aLine2) {
		ALine2 = aLine2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getWorkLoc() {
		return workLoc;
	}
	public void setWorkLoc(String workLoc) {
		this.workLoc = workLoc;
	}
	public String getOdcAccReq() {
		return odcAccReq;
	}
	public void setOdcAccReq(String odcAccReq) {
		this.odcAccReq = odcAccReq;
	}
	public String getDesReq() {
		return desReq;
	}
	public void setDesReq(String desReq) {
		this.desReq = desReq;
	}
	public String getSeatTag() {
		return seatTag;
	}
	public void setSeatTag(String seatTag) {
		this.seatTag = seatTag;
	}
	public EmployeeRegisterDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
