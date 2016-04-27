package ua.service;

import java.util.List;

import ua.dto.BookDTO;
import ua.entity.Book;

public interface BookService {
	void addBook(String title);
	Book getSingleBook(int id);
	List<Book> getAllBooks();
	BookDTO getSingleBookDTO(int id);
	void mergeBook(Book book);

}
