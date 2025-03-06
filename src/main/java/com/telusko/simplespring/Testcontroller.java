package com.telusko.simplespring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Testcontroller {
	
	@RequestMapping ("/")
	public String test() {	
	return "This is test project";
	}

}
