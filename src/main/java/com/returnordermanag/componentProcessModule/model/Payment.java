package com.returnordermanag.componentProcessModule.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "payment")
public class Payment {
	@Id
	private int requestID;
	private long creditCardNumber;
	private double creditLimit;
	private double processingCharge;
	
}
