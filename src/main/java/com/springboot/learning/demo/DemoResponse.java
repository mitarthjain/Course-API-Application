package com.springboot.learning.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 

@RestController
public class DemoResponse {
	
	@RequestMapping("/demo")
	public String sayDemo() {
		return "This is demo";
	}
	
	
	

}
