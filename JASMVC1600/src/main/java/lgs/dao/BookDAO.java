package lgs.dao;

import java.util.List;

import lgs.entity.Book;

public interface BookDAO {
	
	void insertBook(Book book);
	
	Book getBookByID(int id);
	
	List<Book> getAllBooks();

}
