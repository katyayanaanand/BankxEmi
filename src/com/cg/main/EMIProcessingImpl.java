package com.cg.main;

import java.util.*;

public class EMIProcessingImpl implements EMIProcessing{
	
	public Loan getUser(String bankName, String borrowerName, ArrayList<Loan> user) {
		for(int i=0; i<user.size(); i++) {
			Loan curUser= user.get(i);
			if(curUser.getBankName().equalsIgnoreCase(bankName) && curUser.getBorrowerName().equalsIgnoreCase(borrowerName)) {
				return curUser;
			}
		}
		System.out.println("User not found");
		return null;
	}
	
	public void loan(String bankName, String borrowerName, long principle, long noOfYears, long rate, ArrayList<Loan> user) {
		long interest= principle*rate*noOfYears/100;
		long amount= principle+interest;
		Loan userObj= new Loan(bankName, borrowerName, principle, noOfYears, rate, amount);
		for(int i=0; i<user.size(); i++) {
			Loan curUser= user.get(i);
			if(curUser.getBankName().equalsIgnoreCase(bankName) && curUser.getBorrowerName().equalsIgnoreCase(borrowerName)) {
				curUser.setAmount(amount+curUser.getAmount());
			}
		}
		user.add(userObj);
		return;
	}
	
	public void payment(String bankName, String borrowerName, long payment, long emiNo, ArrayList<Payment> payments, ArrayList<Loan> user) {
		Payment newPayment= null;
		//Checking if new payment wont make balance less than 0
		for(int i=payments.size()-1; i>=0; i--) {
			Payment payObj= payments.get(i);
			if(payObj.getBankName().equalsIgnoreCase(bankName) && payObj.getBorrowerName().equalsIgnoreCase(borrowerName)) {
				if(payment >= payObj.getBalance()) {
					newPayment= new Payment(bankName, borrowerName, payment, emiNo, 0);
				}
			}
		}
		if(newPayment == null) {
			long amt=0;
			long time=0;
			Loan curUser= getUser(bankName, borrowerName, user);
			if(curUser!=null) {
				amt= curUser.getAmount();
				time= curUser.getNoOfYears();
			}
			long amtLeft= amt-((amt*emiNo)/(time*12));
			newPayment= new Payment(bankName, borrowerName, payment, emiNo, amtLeft);
		}
		payments.add(newPayment);
		return;
	}
	
	public void balance(String bankName, String borrowerName, long emiNo, ArrayList<Payment> payments, ArrayList<Loan> user) {
		
		long amt=0;
		long time=0;
		long totLumSum= 0;
		long balance= 0;
		long emiLeft= 0;
		Loan curUser= getUser(bankName, borrowerName, user);
		if(curUser!=null) {
			amt= curUser.getAmount();
			time= curUser.getNoOfYears();
		}
		for(int i=0; i<payments.size(); i++) {
			Payment payObj= payments.get(i);
			if(payObj.getBankName().equalsIgnoreCase(bankName) && payObj.getBorrowerName().equalsIgnoreCase(borrowerName)) {
				if(payObj.getEmiNo() <= emiNo) {
					totLumSum+=payObj.getLumpSum();
				}
			}
		}
		long emiAmt= (long) Math.ceil((double)amt/(double)(12*time));
		balance= emiAmt*emiNo + totLumSum;
		long balanceLeft= amt-balance;
		emiLeft= (long) Math.ceil((double)(balanceLeft)/(double)emiAmt);
		System.out.println(bankName+" "+borrowerName+" "+balance+" "+emiLeft);
	}
}
