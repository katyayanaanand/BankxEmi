package com.cg.main;

public class Loan {
	String bankName;
	String borrowerName;
	long principle;
	long noOfYears;
	long rate;
	long amount;
	public Loan(String bankName, String borrowerName, long principle, long noOfYears, long rate, long amount) {
		super();
		this.bankName = bankName;
		this.borrowerName = borrowerName;
		this.principle = principle;
		this.noOfYears = noOfYears;
		this.rate = rate;
		this.amount = amount;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Loan [bankName=" + bankName + ", borrowerName=" + borrowerName + ", principle=" + principle
				+ ", noOfYears=" + noOfYears + ", rate=" + rate + ", amount=" + amount + "]";
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public long getPrinciple() {
		return principle;
	}
	public void setPrinciple(long principle) {
		this.principle = principle;
	}
	public long getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(long noOfYears) {
		this.noOfYears = noOfYears;
	}
	public long getRate() {
		return rate;
	}
	public void setRate(long rate) {
		this.rate = rate;
	}
	
}
