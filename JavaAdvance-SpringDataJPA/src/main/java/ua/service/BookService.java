package ua.service;

import java.util.List;

//import ua.dto.BookDTO;
import ua.entity.Book;

public interface BookService {
	void addBook(Book book);
	Book getSingleBook(int id);
	List<Book> getAllBooks();
	void mergeBook(Book book);
	String getImg(int id);
	

//	BookDTO getSingleBookDTO(int id);
}
