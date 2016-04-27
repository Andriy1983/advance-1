package lgs.service;

import java.util.List;

import lgs.entity.Book;

public interface BookService {
	void insrtBook(String title);

	Book getBookByID(int id);

	List<Book> getAllBooks();

}
