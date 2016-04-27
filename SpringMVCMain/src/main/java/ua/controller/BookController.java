package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.AuthorService;
import ua.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authroService;

	

	@RequestMapping(value = "/iWantaddBook")
	public String bookaddPage(Model model) {
		model.addAttribute("authorList", authroService.showAuthors());
		return "bookadd";

	}
	
	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String insertBookController(Model model, @RequestParam(value = "inputBookName") String inputBookName,
			@RequestParam(value = "select") String id) {

		bookService.insertBook(inputBookName, Integer.parseInt(id));
		model.addAttribute("booksWithAuthors", bookService.showBooks());
		return "books";

	}

}
