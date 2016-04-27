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

	@RequestMapping(value = "addAuthor" /* ,method=RequestMethod.GET */)
	public String addAuthor(Model model) {
		model.addAttribute("emptyAuthor", new Author());
		return "author-newAuthor";
	}

	@RequestMapping(value = "/addNewAuthor", method = RequestMethod.POST)
	public String addNewAuthor(@ModelAttribute(value = "emptyAuthor") Author author, Model model) {
		authorService.addAuthor(author);
		return "home";

	}

	@RequestMapping(value = "showAllAuthors")
	public String showAllAuthors(Model model) {
		model.addAttribute("allAuthors", authorService.getAllAuthors());
		return "author-showAllAuthors";

	}
	
	@RequestMapping(value="authorWithBooks")
	public String authorWithBooksController(Model model){
		model.addAttribute("authorWithBooks", authorService.getAuthorDTO(2));
		
		return "author-authorWithBooks";
	}
	

	// @RequestMapping(value="/showAuthorsBook")
	// public String showAuthorsBook(Model model){
	// model.addAttribute("model", authorService.getAuthorDTO(1));
	// return "author-authorWithBook";
	//
	// }

}
