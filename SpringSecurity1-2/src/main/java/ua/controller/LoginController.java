package ua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value="toLoging")
	public String toLoging(){
		return "logMe";
	}
	
	
}
