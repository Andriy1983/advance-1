package ua.dao;

import java.util.List;

import ua.entity.Book;

public interface BookDAO {

	void insertBook(Book book);

	public List<Book> getBooks();

	public Book findBookById(int id);

}
