package com.sds.animalapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VolunteerController {

    @GetMapping("/volunteer/list")
    public String volunteerList() {
        return "volunteer/list"; // "volunteer/list.html" 파일을 가리킵니다.
    }
}
