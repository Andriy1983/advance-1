package ua.service;

import ua.entity.*;
import java.util.List;

public interface BookService {
	void insertBook(String title);
	List<Book> getBooks();
	Book findBook(int id);
	
}
