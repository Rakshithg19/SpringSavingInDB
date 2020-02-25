package com.org.xworkz.service;

import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.xworkz.dto.AwardDTO;

@Service
@RequestMapping("/")
public class AwardServiceImpl implements AwardServiceDAO {

	public AwardServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	
	public boolean ValidateAndSave(AwardDTO awardDTO) {
		System.out.println("Invoking ValidateAndSave method()");
		try {
			System.out.println("Running Validation ");
			boolean valid = false;
			if (Objects.nonNull(awardDTO)) {
				String awardName = awardDTO.getAwardName();
				if (awardName != null && !awardName.isEmpty() && awardName.length() >= 5) {
					System.out.println("awardName is valid");
					valid = true;
				} else {
					System.out.println("awardName is not valid");
					if (awardName == null) {
						System.out.println("No value given for name");
					}
					if (awardName != null && awardName.length() < 5) {
						System.out.println("value given is less than 5 for award name");
					}
					valid = false;
				}
				String sponser = awardDTO.getSponser();
				if (sponser != null && !sponser.isEmpty() && sponser.length() >= 5) {
					System.out.println("sponser name is valid");
					valid = true;
				} else {
					System.out.println("sponser name is not valid");
					if (sponser == null) {
						System.out.println("No value given for sponser");
					}
					if (sponser != null && sponser.length() < 5) {
						System.out.println("value given is less than 5 for sponser name");
					}
					valid = false;
				}
				String gift = awardDTO.getGift();
				if (gift != null && !gift.isEmpty() && gift.length() >= 3) {
					System.out.println("gift is valid");
					valid = true;
				} else {
					System.out.println("gift is not valid");
					if (gift == null) {
						System.out.println("No value given for gift");
					}
					if (gift != null && gift.length() < 3) {
						System.out.println("value given is less than 5 for gift");
					}
					valid = false;
				}
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}
		return false;
	}

}
