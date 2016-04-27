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
	private AuthorService authorService;
	
	@RequestMapping("/")
	public String home(Model model){
		List<Author> authors =authorService.getAllAuthors();
		
		model.addAttribute("key", authors);
		return "index";
	}
	
	@RequestMapping("/authorSingle-{id}")
	public String singleAuthor(@PathVariable(value="id")int id,Model model){
		
		model.addAttribute("sa", authorService.getAuthorByID(id));
		
		return "singleAuthor";
		
	}

}
