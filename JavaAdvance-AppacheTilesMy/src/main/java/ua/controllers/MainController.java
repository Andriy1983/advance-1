package ua.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.Author;
import ua.service.AuthorService;
import ua.service.BookService;

@Controller
public class MainController {
	@Autowired
	AuthorService authorService;
	@Autowired
	BookService bookService;

	@RequestMapping(value = "/addAuthor", method = RequestMethod.POST)
	public String addAuthorController(@RequestParam(value = "authorName") String authorName,
			@RequestParam(value = "authorSurname") String authorSurname) {
		authorService.insertAuthor(authorName, authorSurname);
		return "author-after";
	}
	
	@RequestMapping(value="/showAllAuthors")
	public String showAllAuthorsController(Model model){
		model.addAttribute("all", authorService.getAuthors());
		return "author-all";
	}
	
	@RequestMapping(value="/author-{id}")
	public String thisAuthorContoller(@PathVariable(value="id")String id,Model model){
		
		Author author = authorService.findAuthors(Integer.parseInt(id));
		model.addAttribute("onlyOne", author);
		return "author-one";
	}
	
	@RequestMapping(value="/")
	public String slash(Model model){
		model.addAttribute("springFormModelAtribute", new Author());
		
		return "index";
	}
	
	
	@RequestMapping(value="/springForm", method=RequestMethod.POST)
	public String springFormController(@ModelAttribute(value="springFormModelAtribute")Author author){
		authorService.insertAuthor(author.getName(), author.getSurname());
		return "redirect:/showAllAuthors";
	}
	
	
	@RequestMapping(value="/authorsWithBook")
	public String authorWithBookController(Model model){
		model.addAttribute("authorsWithBook", authorService.authorsWithBook());
		
		return "author-authorsWithBook";
	}
}
