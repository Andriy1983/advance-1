package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.entity.Book;
import ua.service.BookService;

@Controller
public class BookContoller {
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/addBook")
	public String addBook(Model model){
		model.addAttribute("addBookModelAtribute", new Book());
		return "book-newbook";
	}
	
	@RequestMapping(value="/addNewBook" ,method=RequestMethod.POST)
	public String addNewBook(@ModelAttribute(value="title")String title){
		bookService.addBook(title);
		return "home";
	}
	
	@RequestMapping(value="/showAllBooks")
	public String showBooks(Model model){
		
		model.addAttribute("showAllBooks",bookService.getAllBooks());
		return"book-allbooks";
	}

}
