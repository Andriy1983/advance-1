package ua.service;

import java.util.List;

import ua.dto.BookAllDTO;
import ua.entity.Book;

public interface BookService {
	void insertBook(String bookName, int authorId);
	List<BookAllDTO> getBooks();
	Book findByID(int id);

}
