package lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lgs.entity.Author;
import lgs.service.AuthorService;
@Controller
public class HomeController { 
	
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value="/")
	public String welcome(){
		return "base.definition";
	}
	
	
	@RequestMapping(value="/all")
	public String all(Model model){
		model.addAttribute("authors", authorService.getAllAuthors());
		return "author-allAuthors";
	}
	

}
