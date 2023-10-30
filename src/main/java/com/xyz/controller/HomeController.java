package com.xyz.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.xyz.entity.Users;

@Controller
public class HomeController {

	
	@GetMapping(path = "/")
	public String index(Model m) {
		m.addAttribute("today", new Date());
		
		Users u1 = new Users(101,"ram","xyz");
		Users u2 = new Users(102,"Shyam","abc");
		
		m.addAttribute("user1", u1);
		
		return "index";
	}
	
	@GetMapping(path = "/profile")
	public String getProfile(Model md) {
		md.addAttribute("flag", true);
		md.addAttribute("at", null);
//		Users us = new Users(1,"hd","js");
		Users us = null;
		md.addAttribute("at2", us);
		
		Users us1 = new Users(1,"hd1","js1");
		Users us2 = new Users(2,"hd2","js2");
		Users us3 = new Users(3,"hd3","js3");
		Users us4 = new Users(4,"hd4","js4");
		List<Users> ll = new ArrayList<>();
		ll.add(us1);
		ll.add(us2);
		ll.add(us3);
		ll.add(us4);
		md.addAttribute("lis", ll);
		return "userProfile";
	}
	
	@GetMapping(path = "/aboutPage")
	public String about() {
		return "about";
	}
	
	@GetMapping(path = "/Base")
	public String base() {
		return "base";
	}
	
	@GetMapping(path = "/page1")
	public String getPage1() {
		return "page1";
	}
	@GetMapping(path = "/page2")
	public String getPage2() {
		return "page2";
	}
	
	
}
