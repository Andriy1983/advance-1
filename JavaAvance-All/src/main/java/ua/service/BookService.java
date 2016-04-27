package ua.service;

import java.util.List;

import ua.entity.Book;

public interface BookService {
	
	List<Book> MyBookServiceGetAllBooks();
	List<Book>MyBookServiceGetBooksByTitle();
	Book MyBookServiceGetSingleBook(int id);
	void MyBookServiceAddBook(Book book);
	

}
