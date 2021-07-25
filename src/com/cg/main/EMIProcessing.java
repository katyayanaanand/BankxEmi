package com.cg.main;

import java.util.ArrayList;

public interface EMIProcessing {
	public Loan getUser(String bankName, String borrowerName, ArrayList<Loan> user);
	
	public void loan(String bankName, String borrowerName, long principle, long noOfYears, long rate, ArrayList<Loan> user);
	
	public void payment(String bankName, String borrowerName, long payment, long emiNo, ArrayList<Payment> payments, ArrayList<Loan> user);
	
	public void balance(String bankName, String borrowerName, long emiNo, ArrayList<Payment> payments, ArrayList<Loan> user);
}
