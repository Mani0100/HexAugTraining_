package com.hexaware.test;

import java.util.Date;

public class Customer {

	private int custid;
	private String custName;
	private String city;
	private double premium;
	private Date dateOfBirth;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custid, String custName, String city, double premium, Date dateOfBirth) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.city = city;
		this.premium = premium;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", city=" + city + ", premium=" + premium
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
    
}
