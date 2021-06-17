package com.returnordermanag.componentProcessModule.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProcessRequestTest {
	ProcessRequest processRequest = new ProcessRequest();
	
	// Testing methods begins from here...
	
	@Test
	void testGetUserID() {
		processRequest.setUserID(1);
		assertEquals(1, processRequest.getUserID());
	}
	
	@Test
	void testSetUserID() {
		processRequest.setUserID(1);
		assertEquals(1, processRequest.getUserID());
	}
	
	@Test
	void testGetUserName() {
		processRequest.setUserName("Parv");
		assertEquals("Parv", processRequest.getUserName());
	}
	
	@Test
	void testSetUserName() {
		processRequest.setUserName("Parv");
		assertEquals("Parv", processRequest.getUserName());
	}
	
	@Test
	void testGetContactNumber() {
		processRequest.setContactNumber(7389845860L);
		assertEquals(7389845860L, processRequest.getContactNumber());
	}
	
	@Test
	void testSetContactNumber() {
		processRequest.setContactNumber(7389845860L);
		assertEquals(7389845860L, processRequest.getContactNumber());
	}
	
	@Test
	void testGetCreditCardNumber() {
		processRequest.setCreditCardNumber(1234567809);
		assertEquals(1234567809, processRequest.getCreditCardNumber());
	}

	@Test
	void testSetCreditCardNumber() {
		processRequest.setCreditCardNumber(1234567809);
		assertEquals(1234567809, processRequest.getCreditCardNumber());
	}
	
	@Test
	void testGetComponentType() {
		processRequest.setComponentType("accessory");
		assertEquals("accessory", processRequest.getComponentType());
	}
	
	@Test
	void testSetComponentType() {
		processRequest.setComponentType("integral");
		assertEquals("integral", processRequest.getComponentType());
	}
	
	@Test
	void testGetComponentName() {
		processRequest.setComponentName("Mobile");
		assertEquals("Mobile", processRequest.getComponentName());
	}
	
	@Test
	void testSetComponentName() {
		processRequest.setComponentName("Laptop");
		assertEquals("Laptop", processRequest.getComponentName());
	}
	
	@Test
	void testGetQuantityOfDefective() {
		processRequest.setQuantityOfDefective(2);
		assertEquals(2, processRequest.getQuantityOfDefective());
	}
	
	@Test
	void testSetQuantityOfDefective() {
		processRequest.setQuantityOfDefective(2);
		assertEquals(2, processRequest.getQuantityOfDefective());
	}
	
	@Test
	void testGetPriorityRequest() {
		processRequest.setPriorityRequest(false);
		assertEquals(false, processRequest.isPriorityRequest());
	}
	
	@Test
	void testSetPriorityRequest() {
		processRequest.setPriorityRequest(true);
		assertEquals(true, processRequest.isPriorityRequest());
	}
	
	@Test
	void testConstructor() {
		ProcessRequest obj=new ProcessRequest(1, "Parv", 7389845860L, 1234567809, "integral", "Laptop", 1	, true);
		assertEquals(1, obj.getUserID());
		assertEquals("Parv", obj.getUserName());
		assertEquals(7389845860L, obj.getContactNumber());
		assertEquals("Laptop", obj.getComponentName());
		assertEquals(1, obj.getQuantityOfDefective());
		assertTrue(obj.isPriorityRequest());
		assertEquals("integral", obj.getComponentType());
		assertEquals(1234567809, obj.getCreditCardNumber());
		
		
	}
}
