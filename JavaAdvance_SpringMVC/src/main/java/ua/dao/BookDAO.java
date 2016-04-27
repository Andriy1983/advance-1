package ua.dao;

import java.util.List;

import ua.entity.Book;

public interface BookDAO {

	void insertBook(String title);

	 List<Book> getBooks();

	 Book findBookById(int id);

}
