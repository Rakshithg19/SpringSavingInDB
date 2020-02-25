package com.org.xworkz.service;

import com.org.xworkz.dto.MovieDTO;

public interface MovieServiceDAO {
	
	public boolean ValidateAndSave(MovieDTO movieDTO);

}
