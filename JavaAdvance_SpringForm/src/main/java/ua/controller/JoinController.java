package ua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.Author;
import ua.entity.Book;
import ua.service.AuthorService;
import ua.service.BookService;

@Controller
public class JoinController {
	@Autowired
	private AuthorService authorService;
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "joinBookandAuthor")
	public String join(Model model) {
		model.addAttribute("authors", authorService.getAllAuthors());
		model.addAttribute("books", bookService.getAllBooks());
		return "join";
	}

	@RequestMapping(value = "joinForm", method = RequestMethod.POST)
	public String joinForm(Model model, @RequestParam(value = "selectedAuthor") String selectedAuthor,
			@RequestParam(value = "selectedBook") String selectedBook) {
		Author author = authorService.getSingleAuthor(Integer.parseInt(selectedAuthor));
		Book book = bookService.getSingleBook(Integer.parseInt(selectedBook));
		
		book.setAuthor(author);
		
		bookService.mergeBook(book);
		
		
		
		model.addAttribute("prosba", "Enter next join");
		return "join";
	}

}
