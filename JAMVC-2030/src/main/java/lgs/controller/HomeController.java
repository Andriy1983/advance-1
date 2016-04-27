package lgs.controller;

import java.util.List;

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
	private AuthorService as;
	
	@RequestMapping(value="/")
	public String welcome(Model model){
		
		List<Author> authors = as.getAllAuthors();
		System.out.println(authors);
		model.addAttribute("key", authors);
		return "index";
	}

	
	@RequestMapping("/author-{id}")
	public String singleAuthor(@PathVariable()int id, Model model){
		
		Author author = as.getAuthor(id);
		model.addAttribute("author", author);
		return "singAut";
	}
	
	
	

}
