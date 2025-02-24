package com.sds.animalapp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sds.animalapp.common.Pager;
import com.sds.animalapp.domain.VolunteerNotice;
import com.sds.animalapp.model.volunteer.VolunteerService;

@Controller
public class VolunteerController {
	
	@Autowired
	VolunteerService volunteerService;
	
	@Autowired
	private Pager pager;
	
    @GetMapping("/volunteer/list")
    public String volunteerList(Model model, @RequestParam(value="currentPage", defaultValue="1") int currentPage) {
    	
    	pager.init(volunteerService.selectCount(), currentPage);
    	
    	HashMap map=new HashMap();
    	map.put("startIndex", pager.getStartIndex());
		map.put("rowCount", pager.getPageSize());
		
    	// 봉사 목록 가져오기
    	List volunteerList = volunteerService.selectAll(map);
    	
    	// 모델에 데이터 추가
		model.addAttribute("volunteerList", volunteerList);
		model.addAttribute("pager", pager);
		
		// 뷰 반환
        return "volunteer/list";
    }
    
    @GetMapping("/volunteer/writeform")
    public String getWriteForm() {
    	return "volunteer/regist";
    }
    
    //검색결과 가져오기
    @GetMapping("/volunteer/searchform")
    public String getSearchform(Model model, @RequestParam(value="currentPage", defaultValue="1") int currentPage, @RequestParam("keyword") String keyword) {

    	pager.init(volunteerService.selectSearchCount(keyword), currentPage);
    	
    	HashMap map=new HashMap();
    	map.put("startIndex", pager.getStartIndex());
		map.put("rowCount", pager.getPageSize());
		map.put("keyword", keyword);
		
    	// 봉사 목록 가져오기
    	List volunteerList = volunteerService.selectSearch(map);
    	
    	// 모델에 데이터 추가
		model.addAttribute("volunteerList", volunteerList);
		model.addAttribute("pager", pager);
		
		// 뷰 반환
        return "volunteer/list";
    }
    
    @PostMapping("/volunteer/regist")
	public String regist(VolunteerNotice volunteer) {
    	volunteerService.insert(volunteer);
		
		return "redirect:/volunteer/list";
	}
}
