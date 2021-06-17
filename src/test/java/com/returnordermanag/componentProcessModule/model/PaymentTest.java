package com.returnordermanag.componentProcessModule.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PaymentTest {
	Payment payment = new Payment();
	
	// Testing methods begins from here...
	
	@Test
	void testGetRequestID() {
		payment.setRequestID(1);
		assertEquals(1, payment.getRequestID());
	}

	@Test
	void testSetRequestID() {
		payment.setRequestID(2);
		assertEquals(2, payment.getRequestID());
	}

	@Test
	void testGetCreditCardNumber() {
		payment.setCreditCardNumber(1234567089);
		assertEquals(1234567089, payment.getCreditCardNumber());
	}

	@Test
	void testSetCreditCardNumber() {
		payment.setCreditCardNumber(1230456789);
		assertEquals(1230456789, payment.getCreditCardNumber());
	}
	
	@Test
	void testGetCreditLimit() {
		payment.setCreditLimit(2000.0);
		assertEquals(2000.0, payment.getCreditLimit());
	}
	
	@Test
	void testSetCreditLimit() {
		payment.setCreditLimit(2000.0);
		assertEquals(2000.0, payment.getCreditLimit());
	}
	
	@Test
	void testGetProcessingCharge() {
		payment.setProcessingCharge(200.0);
		assertEquals(200.0, payment.getProcessingCharge());
	}
	
	@Test
	void testSetProcessingCharge() {
		payment.setProcessingCharge(100.0);
		assertEquals(100.0, payment.getProcessingCharge());
	}
	
	@Test
	void testConstructor() {
		Payment obj=new Payment(1,1234506789,5000,2000);
		assertEquals(1, obj.getRequestID());
		assertEquals(5000, obj.getCreditLimit());
		assertEquals(2000, obj.getProcessingCharge());
		assertEquals(1234506789, obj.getCreditCardNumber());
		
	}
}
