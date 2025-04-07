package com.muj_unity_fest_member_2025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.muj_unity_fest_member_2025.entity.LoginMember;
import com.muj_unity_fest_member_2025.entity.Message;

@Controller
@RequestMapping("mujunityfestmember")
public class MyController {

	@GetMapping("home")
	public String home() {
		return "home";
	}
	@GetMapping("about")
	public String about() {
		return "about";
	}
	@GetMapping("contact")
	public String contact(Model model) {
		model.addAttribute("Message", new Message());
		return "contact";
	}
	@GetMapping("construction")
	public String construction() {
		return "construction";
	}
	
	public String login(Model model) {
		model.addAttribute("Login", new LoginMember());
		return "login";
	}
	
	
	
}
