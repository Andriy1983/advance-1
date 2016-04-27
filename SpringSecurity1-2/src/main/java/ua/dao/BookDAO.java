package ua.dao;

import java.util.List;

import ua.entity.Book;

public interface BookDAO {
	void addBook(Book book);
	Book getSingleBook(int id);
	List<Book> getAllBooks();
	void mergeBook(Book book);
}
