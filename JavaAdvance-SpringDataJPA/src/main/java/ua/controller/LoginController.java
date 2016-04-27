package ua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/tologin")
	public String tologin(){
		
		return "loging";
	}
	
	

}
