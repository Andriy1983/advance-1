package ua.controller;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.dto.BookDTO;
import ua.entity.Author;
import ua.entity.Book;
import ua.service.AuthorService;
import ua.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	@Autowired
	private AuthorService authorService;

	/* Просмотр списка книг */
	@RequestMapping(value = "/show_all_books")
	public String show_all_books(Model model) {

		model.addAttribute("AllBooks", bookService.bookServiceGetAllBooksWithAuthors());

		return "book-showAllBooks";
	}

	@RequestMapping(value = "/toAddBook")
	public String addBook(Model model) {
		model.addAttribute("authorsList",authorService.authorServiceGetAllAuthors());
		return "book-addBook";
	}

	@RequestMapping(value = "/addNewBook", method = RequestMethod.POST)
	public String addNewBook(@RequestParam(value = "title") String title,
			@RequestParam(value = "description") String description, @RequestParam(value = "year") short year,
			@RequestParam(value = "multiselect") int[] authorId,@RequestParam("id")String id) {

		List<Author> authors = new ArrayList<Author>();
		for (int i : authorId) {
			authors.add(authorService.authorServiceGetSingleAuthorByID(i));
		}

		bookService.bookServiceSaveOrUpdateBook(id, title, description, year, authors);

		return "redirect:/toAddBook";

	}
	
	@RequestMapping(value = "/findBooksByTitle")
	public String findBookByTitle(@RequestParam(value = "title") String title, Model model) {

		model.addAttribute("bookByTitle", bookService.bookserviceFindBooksByTitle(title));

		return "book-forSearchBook";
	}

	/* modify */
	@RequestMapping(value = "/modifyBook-{id}")
	public String modifyBook(@PathVariable(value = "id") String id, Model model) {
		Book book = bookService.bookServiceFindBookByID(Integer.parseInt(id));
		model.addAttribute("book", book);
		model.addAttribute("authorsList", authorService.authorServiceGetAllAuthors());
		return "book-addBook"; /* доделать реф на страницу adbook */
	}

	
	/*delete*/
	@RequestMapping(value = "/deleteBook-{id}")
	public String deleteBook(@PathVariable(value = "id") String id) {
		bookService.bookServiceDeleteBook(Integer.parseInt(id));
		return "redirect:/show_all_books";
	}

}
