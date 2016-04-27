package ua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.Author;
import ua.service.AuthorService;

@Controller
public class MainController {

	@Autowired
	AuthorService authorService;

	@RequestMapping(value = "/url", method = RequestMethod.GET)
	public String mainController(/* Model model - нужна только если хочешь что то отправлять на страницу*/) {

		return "new";

	}

	@RequestMapping(value = "/model")
	public String modelController(Model model) {
		model.addAttribute("name", "value");
		return "model";
	}

	@RequestMapping(value = "/forma", method = RequestMethod.POST)
	public String formController(Model model, @RequestParam(value = "name") String name, /*если стринг имеет наз такое как и value, то можно не писать value=name*/
			@RequestParam(value = "surname") String surname) {
		authorService.saveAuthor(name, surname);
			
		return "redirect:/authors";
	}
	
	@RequestMapping(value="authors")
	public String authorsController(Model model){
		
		List<Author> authors = authorService.showAuthors();
		model.addAttribute("authors", authors);
		
		return "authors";
	}
	
	@RequestMapping(value="author-{id}")
	public String authorsWithIdController(@PathVariable(value="id")String id, Model model){ /*тоже самое то и с @RequestParam*/
		
		Author author = authorService.getAuthorByID(Integer.parseInt(id));
		model.addAttribute("nameAuthor",author );
		return "author";
	} 
	
	
	
	
}
