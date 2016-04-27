package lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lgs.service.AuthorService;
@Controller
public class HomeController { 
	
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value="/")
	public String welcome(Model model){
		model.addAttribute("key", authorService.getAllAuthors());
		return "home";
	}

}
