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
import ua.entity.Book;
import ua.service.AuthorService;
import ua.service.BookService;

@Controller
public class MainController {
	@Autowired
	AuthorService authorService;
	@Autowired
	BookService bookService;

	@RequestMapping(value = "/pageTwo")
	public String pageTwoController() {

		return "pageTwo";
	}

	@RequestMapping(value = "/pageFour")
	public String pageFourController() {
		return "pageFour";
	}

	@RequestMapping(value = "/insertAuthor", method = RequestMethod.POST)
	public String insertAuthorController(@RequestParam(value = "authorName") String authorName,
			@RequestParam(value = "authorSurname") String authorSurname, Model model) {

		authorService.insertAuthor(authorName, authorSurname);

		Author author = new Author(authorName, authorSurname);
		model.addAttribute("author", author);

		return "authorWasInserted";
	}

	@RequestMapping(value = "/showAuthors")
	public String showAllAuthors(Model model) {
		List<Author> authors = authorService.getAuthors();
		System.out.println(authors.size());
		model.addAttribute("allAuthors", authors);
		return "showAuthors";
	}

	@RequestMapping(value = "/pageThree")
	public String pageThreeController(Model model) {
		model.addAttribute("authors", authorService.getAuthors());
		return "pageThree";
	}

	@RequestMapping(value = "/formWithSelect", method = RequestMethod.POST)
	public String p3AddBookWithAuthor(@RequestParam(value = "title") String title,
			@RequestParam(value = "select1") String select1,Model model) {
		
		bookService.insertBook(title, Integer.parseInt(select1));
//		model.addAttribute("booksList", bookService.getBooks()); - отрабатыват ниже 
		
		return "redirect:/showBookWithAuthors";

	}
	@RequestMapping(value="/showBookWithAuthors")
	public String showBookWithAuthorsController(Model model){
		
		model.addAttribute("booksList", bookService.getBooks());
		return "showBookWithAuthors";
		
	}
	
	@RequestMapping(value="/edit-{id}")
	public String ebitBookController(@PathVariable(value="id")String id, Model model){
		Book book = bookService.findByID(Integer.parseInt(id));
		model.addAttribute("bookTitle", book.getTitle());
		model.addAttribute("authors", authorService.getAuthors());
		return "pageThree";
	}

}
