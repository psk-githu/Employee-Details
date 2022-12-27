package com.EmployeeDetails.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="EMPLOYEE_DETAIL")
public class EmployeeDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeID;
	private String employeeName;
	private String emailId;
	private Long mobileNo;
	private String location;
	private Date joiningDate;
	
	public EmployeeDetail(Integer employeeID, String employeeName, String emailId, Long mobileNo, String location,
			Date joiningDate) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.location = location;
		this.joiningDate = joiningDate;
	}
	public EmployeeDetail() {}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
	

}
