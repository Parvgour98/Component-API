package com.returnordermanag.componentProcessModule.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AuthenticationResponse {

	private String jwtToken;
	private Boolean valid;
	
}