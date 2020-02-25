package com.org.xworkz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class MovieDTO implements Serializable {

	private String movieName;
	private String directorName;
	private String year;

	public MovieDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

}
