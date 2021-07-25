package com.cg.main;

import java.util.*;
import java.io.*;

public class UIClass {

	public static void main(String[] args) throws IOException {
		List<String> allLines = new ArrayList<String>();
		
		File file = new File(args[0]);
//		System.out.println(file);
//		return;
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    String line;
	    EMIProcessing emi= new EMIProcessingImpl();
	    ArrayList<Loan> user= new ArrayList<>();
	    ArrayList<Payment> payments= new ArrayList<>();
	    while ((line = br.readLine()) != null)
	    {
	    	String[] lineElements= line.split(" ");
		    String cmd=lineElements[0];
		    switch(cmd) {
		    	case "LOAN" :
		    		emi.loan(lineElements[1], lineElements[2], 
		    				Long.parseLong(lineElements[3]), Long.parseLong(lineElements[4]), 
		    				Long.parseLong(lineElements[5]), user);
		    		
		    	break;
		    	case "PAYMENT" :
		    		emi.payment(lineElements[1], lineElements[2], Long.parseLong(lineElements[3]), 
		    				Long.parseLong(lineElements[4]), payments, user);
		    	break;
		    	case "BALANCE" :
		    		emi.balance(lineElements[1], lineElements[2], Long.parseLong(lineElements[3]), payments, user);
		    	break;
		    }
		    
	        allLines.add(line);
	    }
	    
	    
	    
	    br.close();
	    
	}

}
