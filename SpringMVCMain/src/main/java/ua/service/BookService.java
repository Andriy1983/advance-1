package ua.service;

import java.util.List;

import ua.entity.Book;

public interface BookService {
	void insertBook(String bookName, int authorId);
	List<Book> showBooks();
	Book findBookById(int id);

}
