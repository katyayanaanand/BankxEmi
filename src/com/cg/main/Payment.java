package com.cg.main;

public class Payment {
	String bankName;
	String borrowerName;
	long lumpSum;
	long emiNo;
	long balance;
	public Payment(String bankName, String borrowerName, long lumpSum, long emiNo, long balance) {
		super();
		this.bankName = bankName;
		this.borrowerName = borrowerName;
		this.lumpSum = lumpSum;
		this.emiNo = emiNo;
		this.balance = balance;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public long getLumpSum() {
		return lumpSum;
	}
	public void setLumpSum(long lumpSum) {
		this.lumpSum = lumpSum;
	}
	public long getEmiNo() {
		return emiNo;
	}
	public void setEmiNo(long emiNo) {
		this.emiNo = emiNo;
	}
	@Override
	public String toString() {
		return "Payment [bankName=" + bankName + ", borrowerName=" + borrowerName + ", lumpSum=" + lumpSum + ", emiNo="
				+ emiNo + ", balance=" + balance + "]";
	}
}
