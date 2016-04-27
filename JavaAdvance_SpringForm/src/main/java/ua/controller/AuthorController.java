package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.entity.Author;
import ua.service.AuthorService;

@Controller
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	@RequestMapping(value="addAuthor" ,method=RequestMethod.GET)
	public String addAuthor(Model model){
		model.addAttribute("readyAuthorAtribute", new Author());
		return "author-newauthor";
	}
	
	@RequestMapping(value="/addNewAuthor" , method=RequestMethod.POST)
	public String addNewAuthor(@ModelAttribute(value="readyAuthorAtribute") Author author,Model model){
		authorService.addAuthor(author.getName(), author.getSurname());
		return "home";
		
	}
	
	@RequestMapping(value="showAllAuthors")
	public String showAllAuthors(Model model){
		model.addAttribute("allAuthors", authorService.getAllAuthors());
		return "author-allauthors";
		
	}
	
	@RequestMapping(value="/showAuthorsBook")
	public String showAuthorsBook(Model model){
		model.addAttribute("model", authorService.getAuthorDTO(1));
		return "author-authorWithBook";
		
	}

}
