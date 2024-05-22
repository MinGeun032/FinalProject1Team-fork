package com.sds.animalapp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sds.animalapp.domain.VolunteerNotice;
import com.sds.animalapp.model.volunteer.VolunteerService;

@Controller
public class VolunteerController {
	
	@Autowired
	VolunteerService volunteerService;
	
    @GetMapping("/volunteer/list")
    public String volunteerList(Model model) {
    	HashMap map=new HashMap();
    	
    	// 봉사 목록 가져오기
    	List volunteerList = volunteerService.selectAll(map);
    	
    	// 모델에 데이터 추가
		model.addAttribute("volunteerList", volunteerList);
		
		// 뷰 반환
        return "volunteer/list";
    }
    
    @GetMapping("/volunteer/writeform")
    public String getWriteForm() {
    	return "volunteer/regist";
    }
    
    @PostMapping("/volunteer/regist")
	public String regist(VolunteerNotice volunteer) {
    	volunteerService.insert(volunteer);
		
		return "redirect:/volunteer/list";
	}
}
