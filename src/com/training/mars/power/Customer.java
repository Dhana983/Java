package com.training.mars.power;

public class Customer {

	private int custId;
	private String custName;
	private int unitsConsumed;
	private double billAmount;
	
	
	
	public Customer(int custId, String custName, int unitsConsumed, double billAmount) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.unitsConsumed = unitsConsumed;
		this.billAmount = billAmount;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	
}
