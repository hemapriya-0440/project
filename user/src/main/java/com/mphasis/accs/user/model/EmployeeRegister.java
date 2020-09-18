package com.mphasis.accs.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "employees_registration")

public class EmployeeRegister {
	@Id
    @Column(name = "employee_id", nullable = false)
 	private long empId;		 	
    @Column(name = "first_name", nullable = false)
	@NotEmpty(message="should not be empty")
    @NotNull
	@NotBlank
	private String firstName;
    @Column(name = "last_Name", nullable = false)
	@NotEmpty(message="should not be empty")
    @NotNull
	@NotBlank
	private String lastName;
 	@Column(name = "mail_Id", nullable = false)
	@NotEmpty(message="should not be empty")
 	@NotNull
	@NotBlank
 	private String mailId;		 	
 	@Column(name = "mobile_No", nullable = false)
 	@NotNull
	@NotBlank
	private String mobileNo;		 	
 	@Column(name = "date_of_Birth", nullable = false)
	@NotEmpty(message="choose any one option")
 	@NotNull
	@NotBlank
	public String doB;
 	@Column(name = "project_Id", nullable = false)
 	@NotNull
	@NotBlank
	private String projectId;		 	 
 	@Column(name = "project_Name", nullable = false)
 	@NotNull
	@NotBlank
	@NotEmpty(message="should not be empty")
	private String projectName;		 	 
 	@Column(name = "reporting_Manager", nullable = false)
	@NotEmpty(message="should not be empty")
 	@NotNull
	@NotBlank
	private String repManager;		 	 
 	@Column(name = "project_Role", nullable = false)
	@NotEmpty(message="should not be empty")
 	@NotNull
	@NotBlank
	private String projRole;		 	 
 	@Column(name = "experience", nullable = false)
 	@NotNull
 	@Range(min = 1)
	private int exp;
 	@Column(name = "Address_Line1", nullable = false)
	@NotEmpty(message="should not be empty")
	private String ALine1;			
	@Column(name = "Address_Line2", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	private String ALine2;			
	@Column(name = "City", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	private String City;			
	@Column(name = "State", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	private String State;	
	@Column(name = "Country", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	private String Country;	
    @Column(name = "Pin_Code", nullable = false)
    @NotNull
	@NotBlank
 	private String pinCode;
    @Column(name = "work_Location", nullable = false)
    @NotNull
	@NotBlank
	public String workLoc;			
    @Column(name = "Odc_AccReq")
    @NotNull
	@NotBlank
	public String odcAccReq;			
    @Column(name = "Desktop_Req")
    @NotNull
	@NotBlank
	public String desReq;		
    @NotNull
	@NotBlank
    @Column(name = "Seat_tag")
	public String seatTag;
    public EmployeeRegister() {
		
		// TODO Auto-generated constructor stub
	}
	public EmployeeRegister(long empId, @NotEmpty(message = "should not be empty") String firstName,
			@NotEmpty(message = "should not be empty") String lastName,
			@NotEmpty(message = "should not be empty") String mailId, String mobileNo,
			@NotEmpty(message = "choose any one option") String doB, String projectId,
			@NotEmpty(message = "should not be empty") String projectName,
			@NotEmpty(message = "should not be empty") String repManager,
			@NotEmpty(message = "should not be empty") String projRole, int exp,
			@NotEmpty(message = "should not be empty") String aLine1,
			@NotEmpty(message = "should not be empty") String aLine2,
			@NotEmpty(message = "should not be empty") String city,
			@NotEmpty(message = "should not be empty") String state,
			@NotEmpty(message = "should not be empty") String country, String pinCode, String workLoc, String odcAccReq,
			String desReq, String seatTag, @NotEmpty(message = "choose any one option") String l1Cert,
			@NotEmpty(message = "choose any one option") String l2Cert, String primSkill,
			@NotEmpty(message = "choose any one option") String secSkill, byte[] reSume) {
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
		this.l1Cert = l1Cert;
		this.l2Cert = l2Cert;
		this.primSkill = primSkill;
		this.secSkill = secSkill;
		this.reSume = reSume;
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
	public String getL1Cert() {
		return l1Cert;
	}
	public void setL1Cert(String l1Cert) {
		this.l1Cert = l1Cert;
	}
	public String getL2Cert() {
		return l2Cert;
	}
	public void setL2Cert(String l2Cert) {
		this.l2Cert = l2Cert;
	}
	public String getPrimSkill() {
		return primSkill;
	}
	public void setPrimSkill(String primSkill) {
		this.primSkill = primSkill;
	}
	public String getSecSkill() {
		return secSkill;
	}
	public void setSecSkill(String secSkill) {
		this.secSkill = secSkill;
	}
	public byte[] getReSume() {
		return reSume;
	}
	public void setReSume(byte[] reSume) {
		this.reSume = reSume;
	}
	@Column(name = "L1_Cerification", nullable = false)
	@NotEmpty(message="choose any one option")
	public String l1Cert;		    
    @Column(name = "L2_Cerification", nullable = false)
	@NotEmpty(message="choose any one option")
	public String l2Cert;
    @Column(name = "Primary_Skills", nullable = false)
	public String primSkill;		    
    @Column(name = "Secondary_Skills", nullable = false)
	@NotEmpty(message="choose any one option")
	public String secSkill;
    @Column(name = "Resume", nullable = false)
	public byte[] reSume;


	
	
}
