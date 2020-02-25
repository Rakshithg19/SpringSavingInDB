package com.org.xworkz.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class AwardDTO implements Serializable{
	
	private String awardName;
	private String sponser;
	private String gift;
	
	public AwardDTO() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

}
