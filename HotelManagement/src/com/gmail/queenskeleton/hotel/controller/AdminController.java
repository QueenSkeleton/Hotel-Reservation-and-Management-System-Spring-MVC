package com.gmail.queenskeleton.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/Dashboard")
	public String dashboard() {
		return "admin-dashboard";
	}
	
}
