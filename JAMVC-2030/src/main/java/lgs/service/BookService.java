package lgs.service;

import java.util.List;

import lgs.entity.Book;

public interface BookService {
	
	void insertBook(String title);
	List<Book> getAllBooks();
	

}
