package com.org.xworkz.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ActorDTO implements Serializable{
	
	private String leadActorName;
	private String leadSupportingActorName;
	
	public ActorDTO() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	

}
