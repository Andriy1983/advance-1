package ua.dao;

import java.util.List;

import ua.entity.Book;

public interface BookDAO {
	
	void insertBook(Book book);
	List<Book> getBooks();
	Book findBook(int id);
	
	

}
