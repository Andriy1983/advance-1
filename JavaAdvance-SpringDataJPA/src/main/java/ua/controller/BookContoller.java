package ua.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.dao.BookDAO;
import ua.dto.BookDTO;
import ua.entity.Book;
import ua.service.BookService;

@Controller
public class BookContoller {
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/addBook")
	public String addBook(Model model){
		model.addAttribute("emptyBook", new Book());
		return "book-newBook";
	}
	
	@RequestMapping(value="/addNewBook" ,method=RequestMethod.POST)
	public String addNewBook(@ModelAttribute(value="emptyBook")Book book){
		bookService.addBook(book);
		return "home";
	}
	
	@RequestMapping(value="/showAllBooks")
	public String showBooks(Model model){
		
		model.addAttribute("showAllBooks",bookService.getAllBooks());
		return"book-showAllBooks";
	}
	
//	@RequestMapping(value="oblojka", method=RequestMethod.POST)
//	public String oblojka(@RequestParam(value="img")MultipartFile file,@RequestParam(value="title")String title) throws IOException{
//		Book book = new Book(title, file.getBytes());
//		bookService.addBook(book);
//		
//		
//		return "home";
//		
//	}
	
	@RequestMapping(value="/")
	public String imageAdd(Model model){
		model.addAttribute("image", new BookDTO());
		
		return "home";
		
	}
	
	@RequestMapping(value="oblojka")
	public String getOblojka(@ModelAttribute(value="image")BookDTO bookDTO) throws IOException{
		bookService.addBook(new Book(bookDTO.getTitle(), bookDTO.getFile().getBytes()));
		return "home";
		
	}
	
	@RequestMapping(value="showOblojka")
	public String showOblojka(Model model){
		
		model.addAttribute("showOblojka",bookService.getImg(1));
		return "book-oblojka";
	}

}
