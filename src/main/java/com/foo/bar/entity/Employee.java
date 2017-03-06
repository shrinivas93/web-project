package com.foo.bar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "birth_date")
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private String email;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "joining_date")
	@Temporal(TemporalType.DATE)
	private Date joiningDate;

	@Column(name = "leaving_date")
	@Temporal(TemporalType.DATE)
	private Date leavingDate;

	@Column(name = "current_project_id")
	private Integer currentProjectId;

	@Column(name = "manager_id")
	private Integer managerId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}

	public Integer getCurrentProjectId() {
		return currentProjectId;
	}

	public void setCurrentProjectId(Integer currentProjectId) {
		this.currentProjectId = currentProjectId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", birthDate=" + birthDate + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", joiningDate=" + joiningDate + ", leavingDate="
				+ leavingDate + ", currentProjectId=" + currentProjectId + ", managerId=" + managerId + "]";
	}

}
