package com.returnordermanag.componentProcessModule.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "process_response")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProcessResponse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestID;
	private int userID;
	private double processingCharge;
	private double packagingAndDeliveryCharge;
	private String dateOfDelivery;
}


