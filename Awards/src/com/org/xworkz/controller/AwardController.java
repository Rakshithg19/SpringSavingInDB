package com.org.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.xworkz.dto.AwardDTO;
import com.org.xworkz.service.AwardServiceDAO;

@Controller
@RequestMapping("/")
public class AwardController {
	@Autowired
	private AwardServiceDAO awardServiceDAO;
	
	public AwardController() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	@RequestMapping("/award.do")
	public String onSubmitAwards(AwardDTO awardDTO,ModelMap map) {
		try {
			System.out.println("Invoking onSubmitAwards() method");
			boolean check = this.awardServiceDAO.ValidateAndSave(awardDTO);
			if (check) {
				ModelMap suc = map.addAttribute("successMessage", "Success:Data Saved");
			} else {
				ModelMap fail = map.addAttribute("failureMessage", "Failure:Data not Saved");
			}
			System.out.println(awardDTO);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("INFO:"+e.getMessage());
		}
		return "/Award.jsp";
		
	}

}
