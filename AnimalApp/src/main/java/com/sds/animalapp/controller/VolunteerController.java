package com.sds.animalapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sds.animalapp.domain.VolunteerNotice;
import com.sds.animalapp.model.volunteer.VolunteerService;

@Controller
public class VolunteerController {
	
	@Autowired
	VolunteerService volunteerService;

    @GetMapping("/volunteer/list")
    public String volunteerList() {
        return "volunteer/list"; // "volunteer/list.html" 파일을 가리킵니다.
    }
    @GetMapping("/volunteer/writeform")
    public String getWriteForm() {
    	return "volunteer/regist";
    }
    @PostMapping("/volunteer/regist")
	public String regist(VolunteerNotice volunteer) {
    	volunteerService.insert(volunteer); //3단계: 글 등록
		
		return "redirect:/volunteer/list";
	}
}
