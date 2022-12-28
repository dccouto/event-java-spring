package com.coutech.JavaSpringEvent.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Usuario {
	
	private String nome;
	
	@Setter
	private Boolean status;

}
