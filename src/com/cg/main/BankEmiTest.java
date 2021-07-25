package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankEmiTest {

	EMIProcessingImpl bankEmi;
	ArrayList<Loan> usersObj;
	
	@BeforeEach
	void setUp() throws Exception {
		
		bankEmi= new EMIProcessingImpl();
		usersObj= new ArrayList<>();
	}

	@AfterEach
	void tearDown() throws Exception {
		bankEmi= null;
		usersObj= null;
	}

	@Test
	void testLoan() {
		bankEmi.loan("MBI", "Dave", 1000, 2, 10, usersObj);
		assertEquals(usersObj.size(), 1);
	}
	
	@Test
	void testLoanFail() {
		bankEmi.loan("MBI", "Dave", 1000, 2, 10, usersObj);
		assertFalse(usersObj.isEmpty());
	}

}
