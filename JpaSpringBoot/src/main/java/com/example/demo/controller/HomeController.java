package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.modals.Auther;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String actionIndex() {
		return "index";
		
	}
//	@GetMapping("/list")
//	public String actionList() {
//		return "List";
//		
//	}
//	@GetMapping("/auther")
//	public List<Auther> actionAuther() {
//	List<Auther> list = new ArrayList<>();
//	Auther auther = new Auther();
//	auther.setId(110);
//	auther.setFirstName("theva");
//	auther.setLastName("kajan");
//	
//	Auther auther1 = new Auther();
//	auther1.setId(111);
//	auther1.setFirstName("Palanilingam");
//	auther1.setLastName("Thevakajan");
//	list.add(auther);
//	list.add(auther1);
//	return list;	
//		
//	}
	
}
 