package com.returnordermanag.componentProcessModule.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "process_request")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProcessRequest {
	@Id
	private int userID;
	private String userName;
	private long contactNumber;
	private long creditCardNumber;
	private String componentType;
	private String componentName;
	private int quantityOfDefective;
	private boolean isPriorityRequest;
	
}

