package lgs.dao;

import java.util.List;

import lgs.entity.Book;

public interface BookDAO {
	
	void inserBook(Book book);
	List<Book> getAllBooks();

}
