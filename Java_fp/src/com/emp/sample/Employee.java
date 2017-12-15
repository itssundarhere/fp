package com.emp.sample;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
*/
public class Employee {
	private int id;
	private String name;
	private String emailId;
	private long phone;
	private double basicPay;
	private float houseRentAllowance;
	private float providentFund;
	private float netSalary;

	public Employee(String name, String emailId, long phone, double basicPay, float houseRentAllowance,
			float providentFund) {

		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.basicPay = basicPay;
		this.houseRentAllowance = houseRentAllowance;
		this.providentFund = providentFund;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	

}
