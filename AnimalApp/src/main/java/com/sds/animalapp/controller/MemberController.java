package com.sds.animalapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping("/member/login")
	public String getLoginForm() {
		
		return "member/login"; //member/login 매핑
	}
	@GetMapping("/member/mypage")
	public String getMyPage() {
		
		return "member/mypage";
	}
}
