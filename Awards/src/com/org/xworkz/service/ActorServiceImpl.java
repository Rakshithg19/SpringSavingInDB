package com.org.xworkz.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.org.xworkz.dto.ActorDTO;

@Service
public class ActorServiceImpl implements ActorServiceDAO {

	public ActorServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public boolean ValidateAndSave(ActorDTO actorDTO) {
		System.out.println("Invoked ValidateAndSave() from ActorServiceImpl");
		try {
			boolean valid = false;
			if (Objects.nonNull(actorDTO)) {
				System.out.println("Starting Validatation...");
				String leadActorName = actorDTO.getLeadActorName();
				if (leadActorName != null && !leadActorName.isEmpty() && leadActorName.length() >= 5) {
					System.out.println("lead name is valid");
					valid = true;
				} else {
					System.out.println("lead name is not valid");
					if (leadActorName == null) {
						System.out.println("No value given for name");
					}
					if (leadActorName != null && leadActorName.length() < 5) {
						System.out.println("leadActorName is less than 5");
					}
					valid = false;
				}

				String leadSupportingActorName = actorDTO.getLeadSupportingActorName();
				if (leadSupportingActorName != null && !leadSupportingActorName.isEmpty()
						&& leadSupportingActorName.length() >= 5) {
					System.out.println("lead supporting actor name is valid");
					valid = true;
				} else {
					System.out.println("lead supporting actor name is not valid");
					if (leadSupportingActorName == null) {
						System.out.println("No value given for name");
					}
					if (leadSupportingActorName != null && leadSupportingActorName.length() < 5) {
						System.out.println("leadSupportingActorName is less than 5");
					}
					valid = false;
				}
			}
			return valid;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}
		return false;
	}

}
