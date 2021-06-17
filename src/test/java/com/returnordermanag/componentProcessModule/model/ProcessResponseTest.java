package com.returnordermanag.componentProcessModule.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class ProcessResponseTest {
	ProcessResponse processResponse = new ProcessResponse();
	
	// Testing methods begins from here...
	
	@Test
	void testGetRequestID() {
		processResponse.setRequestID(1);
		assertEquals(1, processResponse.getRequestID());
	}

	@Test
	void testSetRequestID() {
		processResponse.setRequestID(1);
		assertEquals(1, processResponse.getRequestID());
	}
	
	@Test
	void testGetUserID() {
		processResponse.setUserID(1);
		assertEquals(1, processResponse.getUserID());
	}
	
	@Test
	void testSetUserID() {
		processResponse.setUserID(1);
		assertEquals(1, processResponse.getUserID());
	}
	
	@Test
	void testGetProcessingCharge() {
		processResponse.setProcessingCharge(100.0);
		assertEquals(100.0, processResponse.getProcessingCharge());
	}
	
	@Test
	void testSetProcessingCharge() {
		processResponse.setProcessingCharge(200.0);
		assertEquals(200.0, processResponse.getProcessingCharge());
	}
	
	@Test
	void testGetPackagingAndDeliveryCharge() {
		processResponse.setPackagingAndDeliveryCharge(300.0);
		assertEquals(300.0, processResponse.getPackagingAndDeliveryCharge());
	}
	
	@Test
	void testSetPackagingAndDeliveryCharge() {
		processResponse.setPackagingAndDeliveryCharge(400.0);
		assertEquals(400.0, processResponse.getPackagingAndDeliveryCharge());
	}
	
	@Test
	void testGetDateOfDelivery() {
		processResponse.setDateOfDelivery("14/07/2021");
		assertEquals("14/07/2021", processResponse.getDateOfDelivery());
	}
	
	@Test
	void testSetDateOfDelivery() {
		processResponse.setDateOfDelivery("14/07/2021");
		assertEquals("14/07/2021", processResponse.getDateOfDelivery());
	}
	
	@Test
	void testConstructor() {
		ProcessResponse obj=new ProcessResponse(1, 1, 200, 450,"14/07/2021");
		assertEquals(1, obj.getRequestID());
		assertEquals(1, obj.getUserID());
		assertEquals(200, obj.getProcessingCharge());
		assertEquals(450, obj.getPackagingAndDeliveryCharge());
		assertEquals("14/07/2021", obj.getDateOfDelivery());
	}
	
}
