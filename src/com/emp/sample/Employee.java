package com.emp.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Emp_details")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "Emp_id")
	private int id;
	@Column(name = "Emp_name",length=150,nullable=false)
	private String name;
	@Column(name = "Email_id")
	private String emailId;
	@Column(name = "Phone")
	private long phone;
	@Column(name = "BP")
	private double basicPay;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "PF")
	private float providentFund;
	@Transient
	private float netSalary;

	public Employee( String name, String emailId, long phone, double basicPay, float houseRentAllowance,
			float providentFund) {

		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.basicPay = basicPay;
		this.houseRentAllowance = houseRentAllowance;
		this.providentFund = providentFund;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

	
}
