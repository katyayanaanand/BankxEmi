package com.cg.main;

public class Balance {
	String bankName;
	String borrowerName;
	long emiNo;
	public Balance(String bankName, String borrowerName, long emiNo) {
		super();
		this.bankName = bankName;
		this.borrowerName = borrowerName;
		this.emiNo = emiNo;
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
	public long getEmiNo() {
		return emiNo;
	}
	public void setEmiNo(long emiNo) {
		this.emiNo = emiNo;
	}
	@Override
	public String toString() {
		return "Balance [bankName=" + bankName + ", borrowerName=" + borrowerName + ", emiNo=" + emiNo + "]";
	}
	
}
